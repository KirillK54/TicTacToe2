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

        cross = "X";
        zero = "0";
        playerwinner.setText("");
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
        if(button1.getText()=="" && playerwinner.getText()==""){
        button1.setText(cross);
        isPlayerWinner();
            if (playerwinner.getText() == "") {
                AI();
            }
        }
    }
    public void btn2(View view) {
        if(button2.getText()=="" && playerwinner.getText()==""){
        button2.setText(cross);
        isPlayerWinner();
            if (playerwinner.getText() == "") {
                AI();
            }
        }
    }
    public void btn3(View view) {
        if(button3.getText()=="" && playerwinner.getText()==""){
        button3.setText(cross);
        isPlayerWinner();
            if (playerwinner.getText() == "") {
                AI();
            }
        }
    }
    public void btn4(View view) {
        if(button4.getText()=="" && playerwinner.getText()==""){
        button4.setText(cross);
        isPlayerWinner();
            if (playerwinner.getText() == "") {
                AI();
            }
        }
    }
    public void btn5(View view) {
        if(button5.getText()=="" && playerwinner.getText()==""){
        button5.setText(cross);
        isPlayerWinner();
            if (playerwinner.getText() == "") {
                AI();
            }
        }
    }
    public void btn6(View view) {
        if(button6.getText()=="" && playerwinner.getText()==""){
        button6.setText(cross);
        isPlayerWinner();
            if (playerwinner.getText() == "") {
                AI();
            }
        }
    }
    public void btn7(View view) {
        if(button7.getText()=="" && playerwinner.getText()==""){
        button7.setText(cross);
        isPlayerWinner();
            if (playerwinner.getText() == "") {
                AI();
            }
        }
    }
    public void btn8(View view) {
        if(button8.getText()=="" && playerwinner.getText()==""){
        button8.setText(cross);
        isPlayerWinner();
            if (playerwinner.getText() == "") {
                AI();
            }
        }
    }
    public void btn9(View view) {
        if(button9.getText()=="" && playerwinner.getText()==""){
        button9.setText(cross);
        isPlayerWinner();
            if (playerwinner.getText() == "") {
                AI();
            }
        }
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
    public void isAIWinner() {
        if (button1.getText() == zero && button2.getText() == zero && button3.getText() == zero) {
            playerwinner.setText(R.string.ai_winner);
        }
        if (button4.getText() == zero && button5.getText() == zero && button6.getText() == zero) {
            playerwinner.setText(R.string.ai_winner);
        }
        if (button7.getText() == zero && button8.getText() == zero && button9.getText() == zero) {
            playerwinner.setText(R.string.ai_winner);
        }
        if (button1.getText() == zero && button4.getText() == zero && button7.getText() == zero) {
            playerwinner.setText(R.string.ai_winner);
        }
        if (button2.getText() == zero && button5.getText() == zero && button8.getText() == zero) {
            playerwinner.setText(R.string.ai_winner);
        }
        if (button3.getText() == zero && button6.getText() == zero && button9.getText() == zero) {
            playerwinner.setText(R.string.ai_winner);
        }
        if (button1.getText() == zero && button5.getText() == zero && button9.getText() == zero) {
            playerwinner.setText(R.string.ai_winner);
        }
        if (button3.getText() == zero && button5.getText() == zero && button7.getText() == zero) {
            playerwinner.setText(R.string.ai_winner);
        }
    }
    public void AI() {
        Random random = new Random();
        int AIClick = 1 + random.nextInt(9);

        switch(AIClick) {
            case (1): if (button1.getText() == "") {
                button1.setText(zero);
            } else {AI();} break;
            case (2): if (button2.getText() == "") {
                button2.setText(zero);
            } else {AI();} break;
            case (3): if (button3.getText() == "") {
                button3.setText(zero);
            } else {AI();} break;
            case (4): if (button4.getText() == "") {
                button4.setText(zero);
            } else {AI();} break;
            case (5): if (button5.getText() == "") {
                button5.setText(zero);
            } else {AI();} break;
            case (6): if (button6.getText() == "") {
                button6.setText(zero);
            } else {AI();} break;
            case (7): if (button7.getText() == "") {
                button7.setText(zero);
            } else {AI();} break;
            case (8): if (button8.getText() == "") {
                button8.setText(zero);
            } else {AI();} break;
            case (9): if (button9.getText() == "") {
                button9.setText(zero);
            } else {AI();} break;
        }
        isAIWinner();
    }


    public void btn_rest(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        playerwinner.setText("");
    }
}
