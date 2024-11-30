package com.example.challenges;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CompletedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed); // Use the correct layout file for this activity

        // Initialize views
        TextView challengeTitle = findViewById(R.id.challengeTitle);
        TextView challengeDescription = findViewById(R.id.challengeDescription);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        TextView statusText = findViewById(R.id.statusText);
        TextView completionDate = findViewById(R.id.completionDate);

        // Initialize In Progress RadioButton
        RadioButton radioInProgress = findViewById(R.id.radio_in_progress);

        // Set data for the challenge
        challengeTitle.setText("Day 1: Go Meatless for One Day!");
        challengeDescription.setText("Challenge Goal: Reduce your carbon footprint by choosing plant-based meals instead of meat.");

        // Set progress bar (e.g., 100% for completed)
        progressBar.setProgress(100); // Modify based on actual progress

        // Set status and date
        statusText.setText("Finished");
        completionDate.setText("Completed on 11/19/24");

        // Set the onClick listener for the In Progress button
        radioInProgress.setOnClickListener(v -> {
            // Navigate to the InProgressActivity when the "In Progress" button is clicked
            Intent intent = new Intent(CompletedActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
