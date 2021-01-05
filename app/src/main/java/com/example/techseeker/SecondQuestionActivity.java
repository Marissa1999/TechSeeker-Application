package com.example.techseeker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SecondQuestionActivity extends AppCompatActivity {

    private static final String SECOND_QUESTION_LOG_TAG = SecondQuestionActivity.class.getSimpleName();
    public static final String QUESTION_1_RESULT = "com.example.techseeker.question1.RESULT";
    public static final String QUESTION_2_RESULT = "com.example.techseeker.question2.RESULT";
    public String purposeResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);


        final RadioGroup purposeSelectionGroup = findViewById(R.id.purposeSelection);

        purposeSelectionGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup selectionGroup, int position)
            {
                switch (position)
                {
                    case R.id.officeWorkRadioButton: purposeResult = "Office Work"; break;
                    case R.id.casualGamingRadioButton: purposeResult = "Casual Gaming"; break;
                    case R.id.photoEditingRadioButton: purposeResult = "Photo Editing"; break;
                    case R.id.hardcoreGamingRadioButton: purposeResult = "Hardcore Gaming"; break;
                    case R.id.videoEditingRadioButton: purposeResult = "Video Editing"; break;
                    default: purposeResult = null; break;
                }
            }
        });

    }

    public void launchThirdQuestionActivity(View view)
    {
        Intent thirdQuestionIntent = new Intent(this, ThirdQuestionActivity.class);

        Intent firstQuestionIntent = getIntent();
        String firstQuestionResult = firstQuestionIntent.getStringExtra(FirstQuestionActivity.QUESTION_1_RESULT);

        Log.d(SECOND_QUESTION_LOG_TAG, firstQuestionResult);

        thirdQuestionIntent.putExtra(QUESTION_1_RESULT, firstQuestionResult);
        thirdQuestionIntent.putExtra(QUESTION_2_RESULT, purposeResult);

        startActivity(thirdQuestionIntent);

        String launchingMainMessage = "The Questionnaire is Almost Done!";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0 ,0);
        toastMainMessage.show();

        Log.d(SECOND_QUESTION_LOG_TAG, "Launched the ThirdQuestionActivity with Clicked Button.");
        Log.d(SECOND_QUESTION_LOG_TAG, "This is the first question result: " + firstQuestionResult);
        Log.d(SECOND_QUESTION_LOG_TAG, "This is the second question result: " + purposeResult);
    }
}
