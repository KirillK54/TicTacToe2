package ru.kirillsafonov.tictactoe2.gameactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import ru.kirillsafonov.tictactoe2.R;
import ru.kirillsafonov.tictactoe2.helper.themehelper;
import ru.kirillsafonov.tictactoe2.menu.settings;
import ru.kirillsafonov.tictactoe2.menu.startmenu;

public class game extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
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

}
