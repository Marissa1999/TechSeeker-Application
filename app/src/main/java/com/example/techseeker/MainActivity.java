package com.example.techseeker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String MAIN_LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void launchFirstQuestionActivity(View view)
    {
        Intent firstQuestionIntent = new Intent(this, FirstQuestionActivity.class);
        startActivity(firstQuestionIntent);

        String launchingMainMessage = "Let's Go Indeed!";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL,0,0);
        toastMainMessage.show();

        Log.d(MAIN_LOG_TAG, "Launched the FirstQuestionActivity with Clicked Button.");
    }
}
