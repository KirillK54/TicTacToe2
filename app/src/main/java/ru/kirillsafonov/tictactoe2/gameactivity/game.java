package ru.kirillsafonov.tictactoe2.gameactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import ru.kirillsafonov.tictactoe2.R;
import ru.kirillsafonov.tictactoe2.helper.themehelper;
import ru.kirillsafonov.tictactoe2.menu.settings;
import ru.kirillsafonov.tictactoe2.menu.startmenu;

public class game extends AppCompatActivity {
    //кнопки
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;

    String cross, zero;

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
    }
    public void btn2(View view) {
        button2.setText(cross);
    }
    public void btn3(View view) {
        button3.setText(cross);
    }
    public void btn4(View view) {
        button4.setText(cross);
    }
    public void btn5(View view) {
        button5.setText(cross);
    }
    public void btn6(View view) {
        button6.setText(cross);
    }
    public void btn7(View view) {
        button7.setText(cross);
    }
    public void btn8(View view) {
        button8.setText(cross);
    }
    public void btn9(View view) {
        button9.setText(cross);
    }
}
