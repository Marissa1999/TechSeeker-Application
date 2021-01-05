package com.example.techseeker;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class ResultActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener,NavigationView.OnNavigationItemSelectedListener {
    private static final String RESULT_LOG_TAG = ResultActivity.class.getSimpleName();

    private YouTubePlayerView mYoutubePlayerView;
    private YouTubePlayer.OnInitializedListener mOnInitializedListener;
    private int questionnaireSelection;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        Button buttonPlay = findViewById(R.id.playButton);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        Intent thirdQuestionIntent = getIntent();
        String firstQuestionResult = thirdQuestionIntent.getStringExtra(ThirdQuestionActivity.QUESTION_1_RESULT);
        String secondQuestionResult = thirdQuestionIntent.getStringExtra(ThirdQuestionActivity.QUESTION_2_RESULT);
        String thirdQuestionResult = thirdQuestionIntent.getStringExtra(ThirdQuestionActivity.QUESTION_3_RESULT);

        Log.d(RESULT_LOG_TAG, "This is the first question result: " + firstQuestionResult);
        Log.d(RESULT_LOG_TAG, "This is the second question result: " + secondQuestionResult);
        Log.d(RESULT_LOG_TAG, "This is the second question result: " + thirdQuestionResult);

        final ImageView resultImage = findViewById(R.id.resultImage);
        final TextView resultDescription = findViewById(R.id.resultDescription);
        final TextView resultPrice = findViewById(R.id.resultPrice);
        final TextView resultLabel = findViewById(R.id.resultLabel);

        if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Office Work") && thirdQuestionResult.equals("Under $1000")) {
            resultImage.setImageResource(R.drawable.desktop1);
            resultLabel.setText("Dell Inspiron Desktop");
            resultDescription.setText("Extensive storage meets upgraded speed and power without sacrificing performance.");
            resultPrice.setText("$479.99");
            questionnaireSelection = 1;
        }

        if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Office Work") && thirdQuestionResult.equals("Under $1500")) {
            resultImage.setImageResource(R.drawable.desktop2);
            resultLabel.setText("Optiplex 5270 All-in-One");
            resultDescription.setText("Expand your productivity with the Optiplex 5270 All-in-One");
            resultPrice.setText("$1,428.00");
            questionnaireSelection = 2;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Office Work") && thirdQuestionResult.equals("Under $2000")) {
            resultImage.setImageResource(R.drawable.desktop3);
            resultLabel.setText("Apple iMac 21.5\"");
            resultDescription.setText("Easy-to-use technology into an elegant, all-in-one design.");
            resultPrice.setText("$1,949.00");
            questionnaireSelection = 3;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Casual Gaming") && thirdQuestionResult.equals("Under $1000")) {
            resultImage.setImageResource(R.drawable.desktop4);
            resultLabel.setText("Legion Y720 Cube");
            resultDescription.setText("Enjoy high-performance processing and sharp graphics wherever you want to play.");
            resultPrice.setText("$699.00");
            questionnaireSelection = 4;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Casual Gaming") && thirdQuestionResult.equals("Under $1500")) {
            resultImage.setImageResource(R.drawable.desktop5);
            resultLabel.setText("Dell Inspiron 5680 Gaming PC");
            resultDescription.setText("Your portal into the world of realistic graphics and fierce competition.");
            resultPrice.setText("$1,000.00");
            questionnaireSelection = 5;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Casual Gaming") && thirdQuestionResult.equals("Under $2000")) {
            resultImage.setImageResource(R.drawable.desktop6);
            resultLabel.setText("Alienware Aurora Gaming PC");
            resultDescription.setText("Experience gaming like never before with this innovative Alienware Aurora Gaming PC.");
            resultPrice.setText("$1979.99");
            questionnaireSelection = 6;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Photo Editing") && thirdQuestionResult.equals("Under $1000")) {
            resultImage.setImageResource(R.drawable.desktop7);
            resultLabel.setText("HP Pavilion All-In-One");
            resultDescription.setText("Everything you need to take on everyday computing tasks.");
            resultPrice.setText("$699.95");
            questionnaireSelection = 7;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Photo Editing") && thirdQuestionResult.equals("Under $1500")) {
            resultImage.setImageResource(R.drawable.desktop8);
            resultLabel.setText("CyberPowerPc Gamer Xtreme");
            resultDescription.setText("Enthusiast-level gaming PC.");
            resultPrice.setText("$1009.99");
            questionnaireSelection = 8;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Photo Editing") && thirdQuestionResult.equals("Under $2000")) {
            resultImage.setImageResource(R.drawable.desktop3);
            resultLabel.setText("Apple iMac 21.5\"");
            resultDescription.setText("Easy-to-use technology into an elegant, all-in-one design.");
            resultPrice.setText("$1,949.00");
            questionnaireSelection = 9;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Hardcore Gaming") && thirdQuestionResult.equals("Under $1000")) {
            resultImage.setImageResource(R.drawable.desktop9);
            resultLabel.setText("Acer Nitro Gaming PC");
            resultDescription.setText("Powerful, lag-free gaming is easily experienced with the Acer Nitro Gaming PC.");
            resultPrice.setText("$900.99");
            questionnaireSelection = 10;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Hardcore Gaming") && thirdQuestionResult.equals("Under $1500")) {
            resultImage.setImageResource(R.drawable.desktop10);
            resultLabel.setText("HP Omen Obelisk");
            resultDescription.setText("This high-performance gaming PC delivers smooth play and true-to-life visuals.");
            resultPrice.setText("$1500.99");
            questionnaireSelection = 11;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Hardcore Gaming") && thirdQuestionResult.equals("Under $2000")) {
            resultImage.setImageResource(R.drawable.desktop11);
            resultLabel.setText("Acer Predator Orion 3000");
            resultDescription.setText("Mid-range, off-the-shelf gaming PC that won’t break your bank.");
            resultPrice.setText("$1800.99");
            questionnaireSelection = 12;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Video Editing") && thirdQuestionResult.equals("Under $1000")) {
            resultImage.setImageResource(R.drawable.desktop12);
            resultLabel.setText("Lenovo Ideacentre 520s");
            resultDescription.setText("Contemporary and affordable style for video-editing.");
            resultPrice.setText("$8489.99");
            questionnaireSelection = 13;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Video Editing") && thirdQuestionResult.equals("Under $1500")) {
            resultImage.setImageResource(R.drawable.desktop13);
            resultLabel.setText("Apple Mac Mini");
            resultDescription.setText("Modest performance in an extremely compact and elegant case.");
            resultPrice.setText("$1399.99");
            questionnaireSelection = 14;
        }

        else if (firstQuestionResult.equals("PC") && secondQuestionResult.equals("Video Editing") && thirdQuestionResult.equals("Under $2000")) {
            resultImage.setImageResource(R.drawable.desktop3);
            resultLabel.setText("Apple iMac 21.5\"");
            resultDescription.setText("Easy-to-use technology into an elegant, all-in-one design.");
            resultPrice.setText("$1,949.00");
            questionnaireSelection = 15;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Office Work") && thirdQuestionResult.equals("Under $1000")) {
            resultImage.setImageResource(R.drawable.laptop5);
            resultLabel.setText("Asus ZenBook UX333FA-SH51");
            resultDescription.setText("A small but powerful laptop with an elegant design.");
            resultPrice.setText("$999.99");
            questionnaireSelection = 16;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Office Work") && thirdQuestionResult.equals("Under $1500")) {
            resultImage.setImageResource(R.drawable.laptop4);
            resultLabel.setText("Apple Macbook Air 13");
            resultDescription.setText("MacBook Air is a thin and lightweight laptop from Apple.");
            resultPrice.setText("$1449.00");
            questionnaireSelection = 17;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Office Work") && thirdQuestionResult.equals("Under $2000")) {
            resultImage.setImageResource(R.drawable.laptop3);
            resultLabel.setText("Apple Macbook Pro 13");
            resultDescription.setText("It’s the best MacBook Pro ever made, and the number one choice for Mac users.");
            resultPrice.setText("$1699.00");
            questionnaireSelection = 18;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Casual Gaming") && thirdQuestionResult.equals("Under $1000")) {
            resultImage.setImageResource(R.drawable.laptop6);
            resultLabel.setText("Acer Nitro 5");
            resultDescription.setText("A gaming laptop with full HD display and powerful gaming tech.");
            resultPrice.setText("$999.99");
            questionnaireSelection = 19;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Casual Gaming") && thirdQuestionResult.equals("Under $1500")) {
            resultImage.setImageResource(R.drawable.laptop1);
            resultLabel.setText("New Dell XPS 13");
            resultDescription.setText("Simply put, the best laptop overall.");
            resultPrice.setText("$1299.00");
            questionnaireSelection = 20;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Casual Gaming") && thirdQuestionResult.equals("Under $2000")) {
            resultImage.setImageResource(R.drawable.laptop2);
            resultLabel.setText("Razer Blade Stealth 13");
            resultDescription.setText("The best lightweight laptop for gamers.");
            resultPrice.setText("$1849.00");
            questionnaireSelection = 21;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Photo Editing") && thirdQuestionResult.equals("Under $1000")) {
            resultImage.setImageResource(R.drawable.laptop7);
            resultLabel.setText("New Inspiron 15 5000 2-in-1");
            resultDescription.setText("Flexible features to fit your inspiration, whenever it strikes.");
            resultPrice.setText("$749.00");
            questionnaireSelection = 22;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Photo Editing") && thirdQuestionResult.equals("Under $1500")) {
            resultImage.setImageResource(R.drawable.laptop1);
            resultLabel.setText("New Dell XPS 13");
            resultDescription.setText("Simply put, the best laptop overall.");
            resultPrice.setText("$1299.00");
            questionnaireSelection = 23;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Photo Editing") && thirdQuestionResult.equals("Under $2000")) {
            resultImage.setImageResource(R.drawable.laptop3);
            resultLabel.setText("Apple Macbook Pro 13");
            resultDescription.setText("It’s the best MacBook Pro ever made, and the number one choice for Mac users.");
            resultPrice.setText("$1699.00");
            questionnaireSelection = 24;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Hardcore Gaming") && thirdQuestionResult.equals("Under $1000")) {
            resultImage.setImageResource(R.drawable.laptop8);
            resultLabel.setText("Acer Swift 3");
            resultDescription.setText("Style, power and lightweight portability are merged perfectly in the Swift 3.");
            resultPrice.setText("$999.99");
            questionnaireSelection = 25;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Hardcore Gaming") && thirdQuestionResult.equals("Under $1500")) {
            resultImage.setImageResource(R.drawable.laptop9);
            resultLabel.setText("Dell G7 15 Gaming Laptop");
            resultDescription.setText("A gaming laptop with a slim and sleek design.");
            resultPrice.setText("$1229.99");
            questionnaireSelection = 26;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Hardcore Gaming") && thirdQuestionResult.equals("Under $2000")) {
            resultImage.setImageResource(R.drawable.laptop10);
            resultLabel.setText("Acer Predator Helios 300");
            resultDescription.setText("A laptop with unbeatable gaming performance for the price.");
            resultPrice.setText("$1999.99");
            questionnaireSelection = 27;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Video Editing") && thirdQuestionResult.equals("Under $1000")) {
            resultImage.setImageResource(R.drawable.laptop11);
            resultLabel.setText("Acer Aspire 5");
            resultDescription.setText("Powerful, everyday computing at your side.");
            resultPrice.setText("$849.00");
            questionnaireSelection = 28;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Video Editing") && thirdQuestionResult.equals("Under $1500")) {
            resultImage.setImageResource(R.drawable.laptop1);
            resultLabel.setText("New Dell XPS 13");
            resultDescription.setText("Simply put, the best laptop overall.");
            resultPrice.setText("$1299.00");
            questionnaireSelection = 29;
        }

        else if (firstQuestionResult.equals("Laptop") && secondQuestionResult.equals("Video Editing") && thirdQuestionResult.equals("Under $2000")) {
            resultImage.setImageResource(R.drawable.laptop12);
            resultLabel.setText("New Dell XPS 15");
            resultDescription.setText("The world’s smallest 15.6-inch performance laptop with a stunning OLED display option.");
            resultPrice.setText("$1549.00");
            questionnaireSelection = 30;
        }

        mYoutubePlayerView = findViewById(R.id.youtubeVideo);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(RESULT_LOG_TAG, "Successfully Loaded YouTube");

                switch(questionnaireSelection)
                {
                    case 1:  youTubePlayer.loadVideo("qzN2Ol9B4eY"); break;
                    case 2:  youTubePlayer.loadVideo("U4Pe_whAbaU"); break;
                    case 3:  youTubePlayer.loadVideo("YL17EiPe7eE"); break;
                    case 4:  youTubePlayer.loadVideo("dinvdo3O1c0"); break;
                    case 5:  youTubePlayer.loadVideo("GO2_Oz4DSmI"); break;
                    case 6:  youTubePlayer.loadVideo("GRDjPmOD8Is"); break;
                    case 7:  youTubePlayer.loadVideo("cr8qUSYBJ8"); break;
                    case 8:  youTubePlayer.loadVideo("l77oZXU7liM"); break;
                    case 9:  youTubePlayer.loadVideo("YL17EiPe7eE"); break;
                    case 10:  youTubePlayer.loadVideo("LX2QwHTe4"); break;
                    case 11:  youTubePlayer.loadVideo("Bf9PBq1lZTg"); break;
                    case 12:  youTubePlayer.loadVideo("8Vc_Ew-w0Fs"); break;
                    case 13:  youTubePlayer.loadVideo("tdstt9fJVjM"); break;
                    case 14:  youTubePlayer.loadVideo("737dCFBqO4I"); break;
                    case 15:  youTubePlayer.loadVideo("YL17EiPe7eE"); break;
                    case 16:  youTubePlayer.loadVideo("0xT_2jfVaII"); break;
                    case 17:  youTubePlayer.loadVideo("e7sw5xA066Y"); break;
                    case 18:  youTubePlayer.loadVideo("V7pce4nrR4c"); break;
                    case 19:  youTubePlayer.loadVideo("08VHrFaVnzA"); break;
                    case 20:  youTubePlayer.loadVideo("DFjKYBa6ZqU"); break;
                    case 21:  youTubePlayer.loadVideo("3PtbK_0j1sw"); break;
                    case 22:  youTubePlayer.loadVideo("OT0kvQsKkVM"); break;
                    case 23:  youTubePlayer.loadVideo("DFjKYBa6ZqU"); break;
                    case 24:  youTubePlayer.loadVideo("V7pce4nrR4c"); break;
                    case 25:  youTubePlayer.loadVideo("t1VIHS9068Y"); break;
                    case 26:  youTubePlayer.loadVideo("gE92XtxCnyg"); break;
                    case 27:  youTubePlayer.loadVideo("K7pEmHo1CkQ"); break;
                    case 28:  youTubePlayer.loadVideo("K7pEmHo1CkQ"); break;
                    case 29:  youTubePlayer.loadVideo("DFjKYBa6ZqU"); break;
                    case 30:  youTubePlayer.loadVideo("l0HmxGNQ_ao"); break;
                }

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(RESULT_LOG_TAG, "Failed to Initialize YouTube Player");
            }
        };

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(RESULT_LOG_TAG, " Initialized YouTube Player");
                mYoutubePlayerView.initialize(YouTubeConfiguration.getApiKey(), mOnInitializedListener);
            }
        });


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nav_all_pcs:
                launchAllPCsActivity();
                break;
            case R.id.nav_all_laptops:
                launchAllLaptopsActivity();
                break;
            case R.id.nav_feedback:
                launchFeedbackActivity();
                break;
            case R.id.nav_share:
                launchShareActivity();
                break;
            case R.id.nav_settings:
                launchSettingsActivity();
                break;
            case R.id.nav_about:
                launchAboutActivity();
                break;
            case R.id.nav_restart_quiz:
                launchAlertDialog();
                break;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void launchAlertDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(ResultActivity.this);

        builder.setTitle("Would You Like to Restart the Quiz?");

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int position) {
                dialog.dismiss();
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int position)
            {
                launchFirstQuestionActivity();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }



    public void launchFirstQuestionActivity()
    {
        Intent firstQuestionIntent = new Intent(this, FirstQuestionActivity.class);
        startActivity(firstQuestionIntent);

        String launchingMainMessage = "Here We Go Again!";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(RESULT_LOG_TAG, "Launched the FirstQuestionActivity with Clicked Button.");
    }

    public void launchAllPCsActivity()
    {
        Intent allPCsIntent = new Intent(this, AllPCsActivity.class);
        startActivity(allPCsIntent);

        String launchingMainMessage = "Here are All the Available PCs...";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(RESULT_LOG_TAG, "Launched the AllPCsActivity with Clicked Button.");
    }

    public void launchAllLaptopsActivity() {
        Intent allLaptopsIntent = new Intent(this, AllLaptopsActivity.class);
        startActivity(allLaptopsIntent);

        String launchingMainMessage = "Here are All the Available Laptops...";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(RESULT_LOG_TAG, "Launched the AllLaptopsActivity with Clicked Button.");
    }

    public void launchFeedbackActivity() {
        Intent feedbackIntent = new Intent(this, FeedbackActivity.class);
        startActivity(feedbackIntent);

        String launchingMainMessage = "Let Us Hear What You Think!";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(RESULT_LOG_TAG, "Launched the FeedbackActivity with Clicked Button.");
    }

    public void launchShareActivity() {
        Intent shareIntent = new Intent(this, ShareActivity.class);
        startActivity(shareIntent);

        String launchingMainMessage = "Tell the World About Our Application!";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(RESULT_LOG_TAG, "Launched the ShareActivity with Clicked Button.");
    }

    public void launchSettingsActivity() {
        Intent settingsIntent = new Intent(this, SettingsActivity.class);
        startActivity(settingsIntent);

        String launchingMainMessage = "Feel Free to Adjust the Application the Way That You Want...";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(RESULT_LOG_TAG, "Launched the SettingsActivity with Clicked Button.");
    }

    public void launchAboutActivity() {
        Intent aboutIntent = new Intent(this, AboutActivity.class);
        startActivity(aboutIntent);

        String launchingMainMessage = "Find Out More About TechSeeker";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(RESULT_LOG_TAG, "Launched the AboutActivity with Clicked Button.");
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        Log.d(RESULT_LOG_TAG,"Successfully Loaded Youtube");

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Log.d(RESULT_LOG_TAG, "Failed to Initialize YouTube Player");
    }
}
