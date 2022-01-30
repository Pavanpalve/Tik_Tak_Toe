package com.leavemealone.tiktaktoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    char[] board = {'.', '.', '.', '.', '.', '.', '.', '.', '.'};
	// this is comment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void a0(View v) {
        turn(0);
    }

    public void a1(View v) {
        turn(1);
    }

    public void a2(View v) {
        turn(2);
    }

    public void a3(View v) {
        turn(3);
    }

    public void a4(View v) {
        turn(4);
    }

    public void a5(View v) {
        turn(5);
    }

    public void a6(View v) {
        turn(6);
    }

    public void a7(View v) {
        turn(7);
    }

    public void a8(View v) {
        turn(8);
    }

    public void turn(int n) {
        if (board[n] == '.' && count < 8) {
            board[n] = player();
            setDisplay(n);
            count++;
            check();
        } else {
            if (count >= 8) {
                Intent myIntent = new Intent(this, winnerScreen.class);
                myIntent.putExtra("winner", "Match Draw");
                startActivity(myIntent);
            } else
                Toast.makeText(this, "Dimag hai to use karo ,\n Dusre ki jagah pe na khelo,\n Mind itt !!!!", Toast.LENGTH_LONG).show();
        }

    }

    public void check() {
        if ((board[0] == board[1] && board[1] == board[2]) && board[0] != '.' && board[1] != '.' && board[2] != '.') {
            win(board[0]);
        } else if ((board[0] == board[3] && board[3] == board[6]) && board[0] != '.' && board[3] != '.' && board[6] != '.') {
            win(board[0]);
        } else if ((board[0] == board[4] && board[4] == board[8]) && board[0] != '.' && board[4] != '.' && board[8] != '.') {
            win(board[0]);
        } else if ((board[3] == board[4] && board[4] == board[5]) && board[3] != '.' && board[4] != '.' && board[5] != '.') {
            win(board[3]);
        } else if ((board[6] == board[7] && board[7] == board[8]) && board[6] != '.' && board[7] != '.' && board[8] != '.') {
            win(board[6]);
        } else if ((board[6] == board[4] && board[4] == board[2]) && board[6] != '.' && board[4] != '.' && board[2] != '.') {
            win(board[6]);
        } else if ((board[1] == board[4] && board[4] == board[7]) && board[1] != '.' && board[4] != '.' && board[7] != '.') {
            win(board[1]);
        } else if ((board[2] == board[5] && board[5] == board[8]) && board[2] != '.' && board[5] != '.' && board[8] != '.') {
            win(board[2]);
        }
    }

    public char player() {
        if (count % 2 == 0)
            return 'O';
        else
            return 'X';
    }

    public void setDisplay(int pos) {
        switch (pos) {
            case 0:
                TextView a0 = (TextView) findViewById(R.id.a0);
                if (count % 2 == 0) a0.setText("O");
                else
                    a0.setText("X");
                break;
            case 1:
                TextView a1 = (TextView) findViewById(R.id.a1);
                if (count % 2 == 0) a1.setText("O");
                else
                    a1.setText("X");
                break;
            case 2:
                TextView a2 = (TextView) findViewById(R.id.a2);
                if (count % 2 == 0) a2.setText("O");
                else
                    a2.setText("X");
                break;
            case 3:
                TextView a3 = (TextView) findViewById(R.id.a3);
                if (count % 2 == 0) a3.setText("O");
                else
                    a3.setText("X");
                break;
            case 4:
                TextView a4 = (TextView) findViewById(R.id.a4);
                if (count % 2 == 0) a4.setText("O");
                else
                    a4.setText("X");
                break;
            case 5:
                TextView a5 = (TextView) findViewById(R.id.a5);
                if (count % 2 == 0) a5.setText("O");
                else
                    a5.setText("X");
                break;
            case 6:
                TextView a6 = (TextView) findViewById(R.id.a6);
                if (count % 2 == 0) a6.setText("O");
                else
                    a6.setText("X");
                break;
            case 7:
                TextView a7 = (TextView) findViewById(R.id.a7);
                if (count % 2 == 0) a7.setText("O");
                else
                    a7.setText("X");
                break;
            case 8:
                TextView a8 = (TextView) findViewById(R.id.a8);
                if (count % 2 == 0) a8.setText("O");
                else
                    a8.setText("X");
                break;
        }
        TextView player = findViewById(R.id.player);
        if (count % 2 == 1)
            player.setText("Player 1");
        else
            player.setText("Player 2");
    }

    public void win(char sign) {
        count = 9;
        Intent myIntent = new Intent(this, winnerScreen.class);

        if (sign == 'O') {
            //player 1
            myIntent.putExtra("winner", "Winner!!!\nPlayer 1");
        } else {
            //player 2
            myIntent.putExtra("winner", "Winner!!!\nPlayer 2");
        }
        startActivity(myIntent);
    }

}
