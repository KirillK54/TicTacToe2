package ru.kirillsafonov.tictactoe2.helper;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatDelegate;

public class themehelper {

    public static final int THEME_AUTO = 0;
    public static final int THEME_LIGHT = 1;
    public static final int THEME_DARK = 2;

    private static final String PREFS_NAME = "ThemePrefs";
    private static final String THEME_KEY = "AppTheme";

    public static void setTheme(Context context, int theme) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        prefs.edit().putInt(THEME_KEY, theme).apply();

        // Применяем тему сразу для всех Activity
        AppCompatDelegate.setDefaultNightMode(getNightMode(theme));
    }

    public static int getTheme(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return prefs.getInt(THEME_KEY, THEME_AUTO);
    }

    private static int getNightMode(int theme) {
        switch (theme) {
            case THEME_LIGHT: return AppCompatDelegate.MODE_NIGHT_NO;
            case THEME_DARK: return AppCompatDelegate.MODE_NIGHT_YES;
            default: return AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM;
        }
    }

}
