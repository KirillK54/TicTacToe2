package ru.kirillsafonov.tictactoe2.menu;

import static ru.kirillsafonov.tictactoe2.helper.themehelper.THEME_AUTO;
import static ru.kirillsafonov.tictactoe2.helper.themehelper.THEME_DARK;
import static ru.kirillsafonov.tictactoe2.helper.themehelper.THEME_LIGHT;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import ru.kirillsafonov.tictactoe2.R;
import ru.kirillsafonov.tictactoe2.gameactivity.game;
import ru.kirillsafonov.tictactoe2.helper.themehelper;

public class settings extends AppCompatActivity {

    RadioGroup radioGroup;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_menu);

        radioGroup = findViewById(R.id.RadioGroup);
        setupThemeSelection();

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            int selectedTheme = THEME_AUTO;

            if (checkedId == R.id.day_theme) {
                selectedTheme = THEME_LIGHT;
            } else if (checkedId == R.id.night_theme) {
                selectedTheme = THEME_DARK;
            }

            themehelper.setTheme(this, selectedTheme);
            restartAllActivities();
        });

    }

    private void restartAllActivities() {
        Intent intent = new Intent(this, startmenu.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    private void setupThemeSelection() {
        int currentTheme = themehelper.getTheme(this);

        switch (currentTheme) {
            case THEME_LIGHT:
                radioGroup.check(R.id.day_theme);
                break;
            case THEME_DARK:
                radioGroup.check(R.id.night_theme);
                break;
            default:
                radioGroup.check(R.id.auto_theme);
        }

    }

    public void btn_back(View view) {
        Intent intent = new Intent(settings.this, startmenu.class);
        startActivity(intent);
    }

    protected void applyTheme() {
        switch (themehelper.getTheme(this)) {
            case THEME_AUTO:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
                break;
            case THEME_LIGHT:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                break;
            case THEME_DARK:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                break;
        }
    }

    public void restartApp() {
        recreate();
    }

}
