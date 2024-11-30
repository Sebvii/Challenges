package com.example.challenges;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Ohno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohno);

        // Show the "Oh no!" dialog when the activity starts
        showDialog();
    }

    private void showDialog() {
        // Create a dialog to display the message
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Oh no!")
                .setMessage("Your actions are harming the environment. But it’s never too late to make a positive change! Start by taking on these daily challenges.")
                .setPositiveButton("OK", (dialog, which) -> {
                    // Dismiss the dialog and show the main content
                    showContent();
                });

        // Show the dialog
        builder.create().show();
    }

    private void showContent() {
        // Set the content view to the main content layout
        setContentView(R.layout.activity_main);
    }
}
