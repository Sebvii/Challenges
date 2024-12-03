package com.example.challenges;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ChallengeFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_five);

        // Initialize the buttons
        Button laterButton = findViewById(R.id.laterButton);
        Button doneButton = findViewById(R.id.doneButton);

        // Set click listeners
        laterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action for the Later button
                Toast.makeText(ChallengeFive.this, "Later button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action for the Done button
                Toast.makeText(ChallengeFive.this, "Done button clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
