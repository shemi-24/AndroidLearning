package com.js.androlearn.activities;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.js.androlearn.R;

public class TabHostActivity extends ActivityGroup {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_host);

        TabHost tabHost=findViewById(R.id.tabHost);
        tabHost.setup(getLocalActivityManager());

        //Tab1
        TabHost.TabSpec spec=tabHost.newTabSpec("one");
        spec.setIndicator("",getResources().getDrawable(R.drawable.bird));
        Intent intent1=new Intent(TabHostActivity.this,FirstTabActivity.class);
        spec.setContent(intent1);
        tabHost.addTab(spec);

        TabHost.TabSpec spec1=tabHost.newTabSpec("two");
        spec1.setIndicator("Tab Two");
        Intent intent2=new Intent(TabHostActivity.this,SecondTabActivity.class);
        spec1.setContent(intent2);
        tabHost.addTab(spec1);

        TabHost.TabSpec spec3=tabHost.newTabSpec("Three");
        spec3.setIndicator("Tab Three");
        Intent intent3=new Intent(TabHostActivity.this,ThirdTabActivity.class);
        spec3.setContent(intent3);
        tabHost.addTab(spec3);

    }
}