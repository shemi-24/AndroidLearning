package com.js.androlearn.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.js.androlearn.R;
import com.js.androlearn.adapters.GridViewAdapter;

public class GridViewActivity extends AppCompatActivity {


    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView=findViewById(R.id.grdview);
        GridViewAdapter gridViewAdapter=new GridViewAdapter(getApplicationContext());
        gridView.setAdapter(gridViewAdapter);


    }
}