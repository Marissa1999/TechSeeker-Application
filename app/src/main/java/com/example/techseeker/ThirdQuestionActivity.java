package com.example.techseeker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class ThirdQuestionActivity extends AppCompatActivity implements OnItemSelectedListener {

    private static final String THIRD_QUESTION_LOG_TAG = ThirdQuestionActivity.class.getSimpleName();
    public static final String QUESTION_1_RESULT = "com.example.techseeker.question1.RESULT";
    public static final String QUESTION_2_RESULT = "com.example.techseeker.question2.RESULT";
    public static final String QUESTION_3_RESULT = "com.example.techseeker.question3.RESULT";
    public String spinnerBudgetValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);

        Spinner minSpinner = findViewById(R.id.budgetSpinner);
        minSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> minAdapter = ArrayAdapter.createFromResource(this, R.array.budget_array, android.R.layout.simple_spinner_item);
        minAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        minSpinner.setAdapter(minAdapter);
    }

        public void launchResultActivity (View view)
        {
            Intent resultIntent = new Intent(this, ResultActivity.class);

            Intent secondQuestionIntent = getIntent();
            String firstQuestionResult = secondQuestionIntent.getStringExtra(SecondQuestionActivity.QUESTION_1_RESULT);
            String secondQuestionResult = secondQuestionIntent.getStringExtra(SecondQuestionActivity.QUESTION_2_RESULT);

            Log.d(THIRD_QUESTION_LOG_TAG, firstQuestionResult);
            Log.d(THIRD_QUESTION_LOG_TAG, secondQuestionResult);

            resultIntent.putExtra(QUESTION_1_RESULT, firstQuestionResult);
            resultIntent.putExtra(QUESTION_2_RESULT, secondQuestionResult);
            resultIntent.putExtra(QUESTION_3_RESULT, spinnerBudgetValue);

            startActivity(resultIntent);

            String launchingMainMessage = "Here is the Final Result!";
            Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
            toastMainMessage.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0 ,0);
            toastMainMessage.show();

            Log.d(THIRD_QUESTION_LOG_TAG, "Launched the ResultActivity with Clicked Button.");
            Log.d(THIRD_QUESTION_LOG_TAG, "This is the first question result: " + firstQuestionResult);
            Log.d(THIRD_QUESTION_LOG_TAG, "This is the second question result: " + secondQuestionResult);
            Log.d(THIRD_QUESTION_LOG_TAG, "This is the third question result: " + spinnerBudgetValue);
        }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String item = parent.getItemAtPosition(position).toString();

        switch (position)
        {
            case 0: spinnerBudgetValue = "Under $1000"; break;
            case 1: spinnerBudgetValue = "Under $1500"; break;
            case 2: spinnerBudgetValue = "Under $2000"; break;
        }

        Toast toastSpinner = Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG);
                toastSpinner.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL,0,0);
                toastSpinner.show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }
}
