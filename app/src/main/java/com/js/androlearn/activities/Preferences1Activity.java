package com.js.androlearn.activities;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.annotation.Nullable;

import com.js.androlearn.R;

public class Preferences1Activity extends PreferenceActivity {


    CheckBox c1,c2,c3;
    boolean checked=false;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addPreferencesFromResource(R.xml.preferences_file);

        c1=findViewById(R.id.checkBox1);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);


//        c1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                c2.setChecked(checked);
//                c3.setChecked(checked);
//            }
//        });

//        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                c2.setChecked(checked);
//                c3.setChecked(checked);
//            }
//        });
//
//        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                c1.setChecked(checked);
//                c3.setChecked(checked);
//            }
//        });
//
//        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                c2.setChecked(checked);
//                c1.setChecked(checked);
//            }
//        });


    }
}
