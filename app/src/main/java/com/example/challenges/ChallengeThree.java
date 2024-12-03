package com.example.challenges;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ChallengeThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_three);

        // Initialize the buttons
        Button laterButton = findViewById(R.id.laterButton);
        Button doneButton = findViewById(R.id.doneButton);

        // Set click listeners
        laterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action for the Later button
                Toast.makeText(ChallengeThree.this, "Later button clicked", Toast.LENGTH_SHORT).show();

                // Navigate back to the main activity
                Intent intent = new Intent(ChallengeThree.this, MainActivity.class);
                startActivity(intent); // Start the MainActivity
                finish(); // Finish the current activity to remove it from the stack
            }
        });


        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action for the Done button
                Toast.makeText(ChallengeThree.this, "Done button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
