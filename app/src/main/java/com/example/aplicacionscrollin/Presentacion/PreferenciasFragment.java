package com.example.aplicacionscrollin.Presentacion;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.Preference;
import com.example.aplicacionscrollin.R;

public class PreferenciasFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferencias, rootKey);
    }


}