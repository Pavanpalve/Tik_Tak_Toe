package com.leavemealone.tiktaktoe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class winnerScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_screen);
        Intent intent = getIntent();

        String winner = intent.getStringExtra("winner");

        TextView textView = findViewById(R.id.Winner);
        textView.setText(winner);
    }
}
