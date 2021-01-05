package com.example.techseeker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class FirstQuestionActivity extends AppCompatActivity {

    private static final String FIRST_QUESTION_LOG_TAG = FirstQuestionActivity.class.getSimpleName();
    public static final String QUESTION_1_RESULT = "com.example.techseeker.question1.RESULT";
    public String computerSelection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        final ToggleButton pcToggleButton = findViewById(R.id.pcChoiceButton);
        final ToggleButton laptopToggleButton = findViewById(R.id.laptopChoiceButton);

        pcToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    computerSelection = "PC";
                    buttonView.setBackgroundColor(0xFF1930B2);
                    laptopToggleButton.setChecked(false);
                }

                else
                {
                    buttonView.setBackgroundColor(0xFF3AA2CC);
                    pcToggleButton.setChecked(false);
                }
            }
        });


        laptopToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    computerSelection = "Laptop";
                    buttonView.setBackgroundColor(0xFF1930B2);
                    pcToggleButton.setChecked(false);
                }

                else
                {
                    buttonView.setBackgroundColor(0xFF3AA2CC);
                    laptopToggleButton.setChecked(false);
                }
            }
        });

    }


    public void launchSecondQuestionActivity(View view)
    {
        Intent secondQuestionIntent = new Intent(this, SecondQuestionActivity.class);
        secondQuestionIntent.putExtra(QUESTION_1_RESULT, computerSelection);
        startActivity(secondQuestionIntent);

        String launchingMainMessage = "Alright! Let's Move On!";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0 ,0);
        toastMainMessage.show();

        Log.d(FIRST_QUESTION_LOG_TAG, "Launched the SecondQuestionActivity with Clicked Button.");
        Log.d(FIRST_QUESTION_LOG_TAG, "This is the first question result: " + computerSelection);
    }



}
