package com.js.androlearn.activities;

import android.graphics.Color;
import android.view.View;

public class MyClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        v.setBackgroundColor(Color.RED);
    }
}
