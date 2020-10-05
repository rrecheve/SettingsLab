package es.unex.giiis.asee.settingslab;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat {

    public static final String KEY_PREF_NIGHTMODE = "pref_nightmode";
    public static final String KEY_PREF_USERNAME = "pref_username";

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {

        //TODO Load the preferences from an XML resource

    }
}