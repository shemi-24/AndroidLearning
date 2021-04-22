package com.js.androlearn.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.QuickContactBadge;

import com.js.androlearn.R;

public class AccessContactActivity extends AppCompatActivity {



    QuickContactBadge quickContactBadge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_contact);

        quickContactBadge=findViewById(R.id.quickContactBadge);
        quickContactBadge.assignContactFromPhone("1234567890",true);

    }
}