package com.js.androlearn.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.js.androlearn.R;

public class PreferencesActivity extends AppCompatActivity {


    TextView text1,text2,text3;
    Typeface font1,font2,font3;
    String textSize1,textSize2,textSize3;


    SharedPreferences sharedPreferences;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);


        text1=findViewById(R.id.textView1);
        text2=findViewById(R.id.textView2);
        text3=findViewById(R.id.textView3);


        font1=Typeface.createFromAsset(getAssets(),"fonts/poppins/Poppins-Bold.ttf");
        font2=Typeface.createFromAsset(getAssets(),"fonts/proxima_nova/ProximaNova-Extrabold.otf");
        font3=Typeface.createFromAsset(getAssets(),"fonts/open_sans/OpenSans-ExtraBoldItalic.ttf");

        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(PreferencesActivity.this);


    }


    public void SpecifyTheFontForTextView1(){

        boolean fontNumber1ForText1Value,fontNumber2ForText1Value,fontNumber3ForText1Value;

        fontNumber1ForText1Value=sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER1_TEXT1",false);
        fontNumber2ForText1Value=sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER2_TEXT1",false);
        fontNumber3ForText1Value=sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER3_TEXT1",false);

        if(fontNumber1ForText1Value) {
            text1.setTypeface(font1);
            fontNumber2ForText1Value=false;
            fontNumber3ForText1Value=false;
        }
        else if(fontNumber2ForText1Value){
            text1.setTypeface(font2);
        }
        else if(fontNumber3ForText1Value){
            text1.setTypeface(font3);
        }

    }



    public void SpecifyTheFontForTextView2(){

        boolean fontNumber1ForText2Value,fontNumber2ForText2Value,fontNumber3ForText2Value;

        fontNumber1ForText2Value=sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER1_TEXT2",false);
        fontNumber2ForText2Value=sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER2_TEXT2",false);
        fontNumber3ForText2Value=sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER3_TEXT2",false);

        if(fontNumber1ForText2Value) {
            text2.setTypeface(font1);
        }
        else if(fontNumber2ForText2Value){
            text2.setTypeface(font2);
        }
        else if(fontNumber3ForText2Value){
            text2.setTypeface(font3);
        }

    }



    public void SpecifyTheFontForTextView3(){

        boolean fontNumber1ForText3Value,fontNumber2ForText3Value,fontNumber3ForText3Value;

        fontNumber1ForText3Value=sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER1_TEXT3",false);
        fontNumber2ForText3Value=sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER2_TEXT3",false);
        fontNumber3ForText3Value=sharedPreferences.getBoolean("CHECKBOX_FONT_NUMBER3_TEXT3",false);

        if(fontNumber1ForText3Value) {
            text3.setTypeface(font1);
        }
        else if(fontNumber2ForText3Value){
            text3.setTypeface(font2);
        }
        else if(fontNumber3ForText3Value){
            text3.setTypeface(font3);
        }

    }


    public void specifyTheSizeofTextView1(){

        textSize1=sharedPreferences.getString("FONT_SIZE_TEXT1","20");
        text1.setTextSize(Float.parseFloat(textSize1));
    }

    public void specifyTheSizeofTextView2(){

        textSize2=sharedPreferences.getString("FONT_SIZE_TEXT2","20");
        text2.setTextSize(Float.parseFloat(textSize2));
    }

    public void specifyTheSizeofTextView3(){

        textSize3=sharedPreferences.getString("FONT_SIZE_TEXT3","20");
        text3.setTextSize(Float.parseFloat(textSize3));
    }


    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "onResume Method is called", Toast.LENGTH_SHORT).show();
        SpecifyTheFontForTextView1();
        specifyTheSizeofTextView1();
        SpecifyTheFontForTextView2();
        specifyTheSizeofTextView2();
        SpecifyTheFontForTextView3();
        specifyTheSizeofTextView3();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        int id=item.getItemId();

        switch(id){

            case R.id.settings:

                startActivity(new Intent(PreferencesActivity.this,Preferences1Activity.class));

                break;

        }


        return super.onOptionsItemSelected(item);
    }
}