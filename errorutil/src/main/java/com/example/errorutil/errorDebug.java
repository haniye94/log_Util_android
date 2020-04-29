package com.example.errorutil;

import android.util.Log;

public class errorDebug {

    private static final String TAG = "SUOOER_AWSOME_APP";

    public static void d(String message) {
        Log.e(TAG, message);
    }
}
