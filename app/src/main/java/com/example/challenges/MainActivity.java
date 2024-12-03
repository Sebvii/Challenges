package com.example.challenges;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Rewards Button
        Button btnRewards = findViewById(R.id.btnRewards);
        btnRewards.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, RewardsActivity.class)));

        // In Progress Button
        RadioButton radioInProgress = findViewById(R.id.radio_in_progress);
        RadioButton radioCompleted = findViewById(R.id.radio_completed);

        // Find the radio group (Optional for managing mutually exclusive radio buttons)
        RadioGroup radioGroup = findViewById(R.id.radio_group_status);

        // Set a click listener on the RadioButtons
        radioInProgress.setOnClickListener(v -> {
            // Highlight In Progress button in green
            radioInProgress.setButtonTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.dark_green));

            // Reset Completed button to its default color
            radioCompleted.setButtonTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.lightGreen));

            // Navigate to the desired activity
            startActivity(new Intent(MainActivity.this, MainActivity.class));
        });

        radioCompleted.setOnClickListener(v -> {
            // Highlight Completed button in green
            radioCompleted.setButtonTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.dark_green));

            // Reset In Progress button to its default color
            radioInProgress.setButtonTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.lightGreen));

            // Navigate to another activity
            startActivity(new Intent(MainActivity.this, CompletedActivity.class));
        });

        // Day 1 Start Button
        findViewById(R.id.btnStartChallenge1).setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ChallengeOne.class))
        );

        // Day 2 Start Button
        findViewById(R.id.btnStartChallenge2).setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ChallengeTwo.class))
        );

        // Day 3 Start Button
        findViewById(R.id.btnStartChallenge3).setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ChallengeThree.class))
        );

        // Day 4 Start Button
        findViewById(R.id.btnStartChallenge4).setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ChallengeFour.class))
        );

        // Day 5 Start Button
        findViewById(R.id.btnStartChallenge5).setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ChallengeFive.class))
        );
    }
}
