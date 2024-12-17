/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package rosbifbr.typist.inputmethod.latin.settings;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.SwitchPreference;

import rosbifbr.typist.inputmethod.R;
import rosbifbr.typist.inputmethod.keyboard.KeyboardLayoutSet;

/**
 * "Voice API" settings sub screen.
 *
 * This settings sub screen handles the following input preferences.
 * - OpenAI Whisper API key
 */
public final class PreferencesVoiceApiFragment extends SubScreenFragment {
    @Override
    public void onCreate(final Bundle icicle) {
        super.onCreate(icicle);
        addPreferencesFromResource(R.xml.prefs_voice_api_preferences);
    }

    @Override
    public void onSharedPreferenceChanged(final SharedPreferences prefs, final String key) {
      // no override for now
    }
}
