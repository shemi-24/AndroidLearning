package com.js.androlearn.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.js.androlearn.R;

public class SecondActivity extends AppCompatActivity {

    private EditText age;
    private Button check;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        age=findViewById(R.id.age);
        check=findViewById(R.id.check);
        result=findViewById(R.id.result);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Integer.parseInt(age.getText().toString())>18){
                    result.setText("You selected as android developer");
                }else{
                    result.setText("Sorry! Your age is not fit for this position");
                }
            }
        });
    }
}