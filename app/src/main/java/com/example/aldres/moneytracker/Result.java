package com.example.aldres.moneytracker;

import android.text.TextUtils;

/**
 * Created by Aldres on 25.11.2017.
 */

public class Result {
    String status;

    public boolean isSuccess() {

        return TextUtils.equals(status, "success");
    }

}
