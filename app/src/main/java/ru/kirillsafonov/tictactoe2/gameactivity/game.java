package ru.kirillsafonov.tictactoe2.gameactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import java.util.Random;

import ru.kirillsafonov.tictactoe2.R;
import ru.kirillsafonov.tictactoe2.helper.themehelper;
import ru.kirillsafonov.tictactoe2.menu.settings;
import ru.kirillsafonov.tictactoe2.menu.startmenu;

public class game extends AppCompatActivity {
    //кнопки
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;

    String cross, zero;
    TextView playerwinner;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);

        cross = "X";
        zero = "0";

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        playerwinner = findViewById(R.id.player_winner);
    }

    public void btn_back(View view) {
        Intent intent = new Intent(game.this, startmenu.class);
        startActivity(intent);
    }

    protected void applyTheme() {
        switch (themehelper.getTheme(this)) {
            case themehelper.THEME_AUTO:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
                break;
            case themehelper.THEME_LIGHT:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                break;
            case themehelper.THEME_DARK:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                break;
        }
    }

    public void restartApp() {
        recreate();
    }

    public void btn_settings(View view) {
        Intent intent = new Intent(game.this, settings.class);
        startActivity(intent);
    }

    public void btn1(View view) {
        button1.setText(cross);
        isPlayerWinner();
        AI();
    }
    public void btn2(View view) {
        button2.setText(cross);
        isPlayerWinner();
        AI();
    }
    public void btn3(View view) {
        button3.setText(cross);
        isPlayerWinner();
        AI();
    }
    public void btn4(View view) {
        button4.setText(cross);
        isPlayerWinner();
        AI();
    }
    public void btn5(View view) {
        button5.setText(cross);
        isPlayerWinner();
        AI();
    }
    public void btn6(View view) {
        button6.setText(cross);
        isPlayerWinner();
        AI();
    }
    public void btn7(View view) {
        button7.setText(cross);
        isPlayerWinner();
        AI();
    }
    public void btn8(View view) {
        button8.setText(cross);
        isPlayerWinner();
        AI();
    }
    public void btn9(View view) {
        button9.setText(cross);
        isPlayerWinner();
        AI();
    }

    public void isPlayerWinner() {
        if (button1.getText() == cross && button2.getText() == cross && button3.getText() == cross) {
            playerwinner.setText(R.string.player_winner);
        }
        if (button4.getText() == cross && button5.getText() == cross && button6.getText() == cross) {
            playerwinner.setText(R.string.player_winner);
        }
        if (button7.getText() == cross && button8.getText() == cross && button9.getText() == cross) {
            playerwinner.setText(R.string.player_winner);
        }
        if (button1.getText() == cross && button4.getText() == cross && button7.getText() == cross) {
            playerwinner.setText(R.string.player_winner);
        }
        if (button2.getText() == cross && button5.getText() == cross && button8.getText() == cross) {
            playerwinner.setText(R.string.player_winner);
        }
        if (button3.getText() == cross && button6.getText() == cross && button9.getText() == cross) {
            playerwinner.setText(R.string.player_winner);
        }
        if (button1.getText() == cross && button5.getText() == cross && button9.getText() == cross) {
            playerwinner.setText(R.string.player_winner);
        }
        if (button3.getText() == cross && button5.getText() == cross && button7.getText() == cross) {
            playerwinner.setText(R.string.player_winner);
        }
    }
    public void AI() {
        Random random = new Random();
        int AIClick = 1 + random.nextInt(9);

        switch(AIClick) {
            case (1): button1.setText(zero); break;
            case (2): button2.setText(zero); break;
            case (3): button3.setText(zero); break;
            case (4): button4.setText(zero); break;
            case (5): button5.setText(zero); break;
            case (7): button6.setText(zero); break;
            case (8): button8.setText(zero); break;
            case (9): button9.setText(zero); break;
        }
    }


}
