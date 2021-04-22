package com.js.androlearn.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.js.androlearn.R;
import com.js.androlearn.adapters.CustomizeListAdapter;

public class CustomizeListView extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_list_view);

        listView=findViewById(R.id.listview);
        CustomizeListAdapter customizeListAdapter=new CustomizeListAdapter(getApplicationContext());
        listView.setAdapter(customizeListAdapter);



    }
}