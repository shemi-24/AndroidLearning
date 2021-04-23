package com.js.androlearn.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.js.androlearn.R;

//import com.js.androlearn.R;

public class LanscapeUiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanscape_ui);

        TextView txtInclude=findViewById(R.id.txtInclude);
        Button btnInclude=findViewById(R.id.btnInclude);
        CheckBox chxInclude=findViewById(R.id.chxInclude);

        btnInclude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtInclude.setText("This text is changed");
                chxInclude.setChecked(true);
                chxInclude.setText("The value is true");
            }
        });
    }
}