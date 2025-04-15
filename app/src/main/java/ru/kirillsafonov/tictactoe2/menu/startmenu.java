package ru.kirillsafonov.tictactoe2.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import ru.kirillsafonov.tictactoe2.R;
import ru.kirillsafonov.tictactoe2.gameactivity.game;
import ru.kirillsafonov.tictactoe2.helper.themehelper;


public class startmenu extends AppCompatActivity {

    //Вводим кнопки
    Button play, settings;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        //инициализация кнопок
        play = findViewById(R.id.play_button);
        settings = findViewById(R.id.settings_button);
    }

    //кнопка "Играть"
    public void btn_play(View view) {
        Intent intent = new Intent(startmenu.this, game.class);
        startActivity(intent);
    }

    //кнопка "Настройки"
    public void btn_settings(View view) {
        Intent intent = new Intent(startmenu.this, ru.kirillsafonov.tictactoe2.menu.settings.class);
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

}
