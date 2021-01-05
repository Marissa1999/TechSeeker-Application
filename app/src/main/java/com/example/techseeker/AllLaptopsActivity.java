package com.example.techseeker;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.Toast;

import com.example.techseeker.model.LaptopItem;

import java.util.List;

public class AllLaptopsActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String ALL_LAPTOPS_LOG_TAG = AllPCsActivity.class.getSimpleName();

    private LaptopItemViewModel mLaptopViewModel;
    protected RecyclerView mRecyclerView;
    protected LaptopAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_laptops);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        this.mRecyclerView = findViewById(R.id.all_laptops_recyclerView);
        this.mAdapter = new LaptopAdapter(this);
        this.mRecyclerView.setAdapter(this.mAdapter);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.mLaptopViewModel = ViewModelProviders.of(this).get(LaptopItemViewModel.class);
        this.mLaptopViewModel.getAllLaptopItems().observe(this, new Observer<List<LaptopItem>>()
        {
            @Override
            public void onChanged(@Nullable List<LaptopItem> laptopItems)
            {
                mAdapter.setLaptopItems(laptopItems);
            }
        });

        final Button specificationButton = findViewById(R.id.specsButton);
        final Button favouritesButton = findViewById(R.id.favouritesButton);

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

        AlertDialog.Builder builder = new AlertDialog.Builder(AllLaptopsActivity.this);

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

        Log.d(ALL_LAPTOPS_LOG_TAG, "Launched the FirstQuestionActivity with Clicked Button.");
    }

    public void launchResultActivity()
    {
        Intent resultIntent = new Intent(this, ResultActivity.class);
        startActivity(resultIntent);

        String launchingMainMessage = "Home Sweet Home...";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(ALL_LAPTOPS_LOG_TAG, "Launched the ResultActivity with Clicked Button.");
    }

    public void launchAllPCsActivity()
    {
        Intent allPCsIntent = new Intent(this, AllPCsActivity.class);
        startActivity(allPCsIntent);

        String launchingMainMessage = "Here are All the Available PCs...";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(ALL_LAPTOPS_LOG_TAG, "Launched the AllPCsActivity with Clicked Button.");
    }

    public void launchAllLaptopsActivity() {
        Intent allLaptopsIntent = new Intent(this, AllLaptopsActivity.class);
        startActivity(allLaptopsIntent);

        String launchingMainMessage = "Here are All the Available Laptops...";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(ALL_LAPTOPS_LOG_TAG, "Launched the AllLaptopsActivity with Clicked Button.");
    }

    public void launchFeedbackActivity() {
        Intent feedbackIntent = new Intent(this, FeedbackActivity.class);
        startActivity(feedbackIntent);

        String launchingMainMessage = "Let Us Hear What You Think!";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(ALL_LAPTOPS_LOG_TAG, "Launched the FeedbackActivity with Clicked Button.");
    }

    public void launchShareActivity() {
        Intent shareIntent = new Intent(this, ShareActivity.class);
        startActivity(shareIntent);

        String launchingMainMessage = "Tell the World About Our Application!";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(ALL_LAPTOPS_LOG_TAG, "Launched the ShareActivity with Clicked Button.");
    }

    public void launchSettingsActivity() {
        Intent settingsIntent = new Intent(this, SettingsActivity.class);
        startActivity(settingsIntent);

        String launchingMainMessage = "Feel Free to Adjust the Application the Way That You Want...";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(ALL_LAPTOPS_LOG_TAG, "Launched the SettingsActivity with Clicked Button.");
    }

    public void launchAboutActivity() {
        Intent aboutIntent = new Intent(this, AboutActivity.class);
        startActivity(aboutIntent);

        String launchingMainMessage = "Find Out More About TechSeeker";
        Toast toastMainMessage = Toast.makeText(this, launchingMainMessage, Toast.LENGTH_SHORT);
        toastMainMessage.show();

        Log.d(ALL_LAPTOPS_LOG_TAG, "Launched the AboutActivity with Clicked Button.");
    }

}
