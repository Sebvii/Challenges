package com.example.challenges;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    // Declare RadioGroup and RadioButtons
    private RadioGroup radioGroup;
    private RadioButton radio_in_progress;
    private RadioButton radio_completed;

    // Declare views for the challenge cards
    private TextView tvChallengeTitle1, tvChallengeDescription1;
    private Button btnStartChallenge1;

    private TextView tvChallengeTitle2, tvChallengeDescription2;
    private Button btnStartChallenge2;

    private TextView tvChallengeTitle3, tvChallengeDescription3;
    private Button btnStartChallenge3;

    private TextView tvChallengeTitle4, tvChallengeDescription4;
    private Button btnStartChallenge4;

    private TextView tvChallengeTitle5, tvChallengeDescription5;
    private Button btnStartChallenge5;

    private Button btnRewards;



        // Initialize the RadioGroup and RadioButtons
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Initialize the RadioGroup and RadioButtons
            radioGroup = findViewById(R.id.radio_group_status);
            radio_in_progress = findViewById(R.id.radio_in_progress);
            radio_completed = findViewById(R.id.radio_completed);

            // Set OnCheckedChangeListener for the RadioGroup
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    if (checkedId == R.id.radio_in_progress) {
                        // Update text colors
                        radio_in_progress.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white));
                        radio_completed.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.gray));

                        // Optional: if you want to ensure the main activity is on top, you can finish this activity
                        // and reopen it (if needed)
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish(); // Close the current instance
                    } else if (checkedId == R.id.radio_completed) {
                        // Update text colors
                        radio_completed.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white));
                        radio_in_progress.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.gray));

                        // Navigate to a new Activity when "Completed" is selected
                        Intent intent = new Intent(MainActivity.this, CompletedActivity.class); // Replace CompletedActivity with your target Activity
                        startActivity(intent);
                    }
                }
            });

            // Other initialization code here...



        // Initialize the views for the first challenge card
        tvChallengeTitle1 = findViewById(R.id.tvChallengeTitle1);
        tvChallengeDescription1 = findViewById(R.id.tvChallengeDescription1);
        btnStartChallenge1 = findViewById(R.id.btnStartChallenge1);

        // Initialize the views for the second challenge card
        tvChallengeTitle2 = findViewById(R.id.tvChallengeTitle2);
        tvChallengeDescription2 = findViewById(R.id.tvChallengeDescription2);
        btnStartChallenge2 = findViewById(R.id.btnStartChallenge2);

        // Initialize the views for the third challenge card
        tvChallengeTitle3 = findViewById(R.id.tvChallengeTitle3);
        tvChallengeDescription3 = findViewById(R.id.tvChallengeDescription3);
        btnStartChallenge3 = findViewById(R.id.btnStartChallenge3);

        // Initialize the views for the fourth challenge card
        tvChallengeTitle4 = findViewById(R.id.tvChallengeTitle4);
        tvChallengeDescription4 = findViewById(R.id.tvChallengeDescription4);
        btnStartChallenge4 = findViewById(R.id.btnStartChallenge4);

        tvChallengeTitle5 = findViewById(R.id.tvChallengeTitle5);
        tvChallengeDescription5 = findViewById(R.id.tvChallengeDescription5);
        btnStartChallenge5 = findViewById(R.id.btnStartChallenge5);

        // Initialize the Rewards button
        btnRewards = findViewById(R.id.btnRewards);

        // Set onClick listeners for the challenge buttons
        btnStartChallenge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChallenge(1);
            }
        });

        btnStartChallenge2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChallenge(2);
            }
        });

        btnStartChallenge3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChallenge(3);
            }
        });

        btnStartChallenge4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChallenge(4);
            }
        });
        btnStartChallenge5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChallenge(4);
            }
        });
        // Set onClick listener for Rewards button
        btnRewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Rewards Activity
                Intent intent = new Intent(MainActivity.this, RewardsActivity.class);
                startActivity(intent);
            }
        });
    }

    // Method to handle starting the challenge
    private void startChallenge(int challengeNumber) {
        switch (challengeNumber) {
            case 1:
                // Handle the logic for starting the first challenge
                Intent intent1 = new Intent(MainActivity.this, ChallengeOne.class);
                startActivity(intent1);
                break;
            case 2:
                // Handle the logic for starting the second challenge
                Intent intent2 = new Intent(MainActivity.this, ChallengeTwo.class);
                startActivity(intent2);
                break;
            case 3:
                // Handle the logic for starting the third challenge
                Intent intent3 = new Intent(MainActivity.this, ChallengeThree.class);
                startActivity(intent3);
                break;
            case 4:
                // Handle the logic for starting the fourth challenge
                Intent intent4 = new Intent(MainActivity.this, ChallengeFour.class);
                startActivity(intent4);
                break;
            case 5:
                // Handle the logic for starting the fourth challenge
                Intent intent5 = new Intent(MainActivity.this, ChallengeFive.class);
                startActivity(intent5);
                break;
        }
    }
}
