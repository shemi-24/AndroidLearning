package com.js.androlearn.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.js.androlearn.R;

public class MainActivity extends AppCompatActivity {


    private EditText text1,text2;
    private Button calculate,animalActivity,gridActivity,imageSwatcher,viewFlipper,accessContact,tabHost,imageDownload,notification,preferences,spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);

        animalActivity=findViewById(R.id.btnAnimalActivity);
        animalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CustomizeListView.class));
            }
        });
         gridActivity=findViewById(R.id.btnGridView);
         gridActivity.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this,GridViewActivity.class));
             }
         });

         imageSwatcher=findViewById(R.id.btnImageSwatch);
         imageSwatcher.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this,ImageSwitcherActivity.class));
             }
         });


         viewFlipper=findViewById(R.id.btnViewFlipperAnimator);
         viewFlipper.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this,ViewFlipperAnimatorActivity.class));
             }
         });

         accessContact=findViewById(R.id.btnAccessContact);
         accessContact.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this,AccessContactActivity.class));
             }
         });
        imageDownload=findViewById(R.id.btnImageInternet);
        imageDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ImageDownloadActivity.class));
            }
        });
        tabHost=findViewById(R.id.btnTabhost);
        tabHost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,TabHostActivity.class));
            }
        });


        notification=findViewById(R.id.btnNotification);
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,NotificationActivity.class ));
            }
        });

        preferences=findViewById(R.id.btnPreference);
        preferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, PreferencesActivity.class ));
            }
        });


        spinner=findViewById(R.id.btnSpinner);
        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SpinnerActivity.class));
            }
        });




        calculate=findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(Integer.parseInt(text1.getText().toString())>Integer.parseInt(text2.getText().toString())){
                    calculate.setText(text1.getText().toString()+"greater");
                    GotoNext();
                } else if(Integer.parseInt(text1.getText().toString())<Integer.parseInt(text2.getText().toString())){
                    calculate.setText(text2.getText().toString()+"greater");
                    GotoNext();
                } else{
                    calculate.setText("Equal");
                    GotoNext();
                }
            }
        });

//        Log.d("hello","Good");
//        TextView textView=findViewById(R.id.textView);
//        EditText editText1=findViewById(R.id.editTextTextPersonName);
//        EditText editText2=findViewById(R.id.editTextTextPersonName2);
//        Button button=findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int a=Integer.parseInt(String.valueOf(editText1.getText()));
//                int b=Integer.parseInt(String.valueOf(editText2.getText()));
//                int result=(a/b);
//                textView.setText(result+"");
//            }
//        });

//            int[] myIntNumbers={5,3,2,5,6,7,8};
//            int fisrt=myIntNumbers[5];
//            Log.i("My Value", myIntNumbers[myIntNumbers.length-1]+"");
//            ArrayList vehicles=new ArrayList();
//            vehicles.add("ertiga");
//            vehicles.add("fortuner");
//            vehicles.add("i10");
//            Log.i("vehicle",vehicles.get(1).toString());
//            vehicles.remove("i10");
//            Log.i("vehicle",vehicles.toString());
//            vehicles.add("wagoner");
//            Log.i("vehicle",vehicles.toString());
//
//            ArrayList<String> mobiles=new ArrayList<>();

//        HashMap computers=new HashMap();
//        computers.put(1,"sony");
//        //Log.i("mobiles",computers.toString());
//        //Log.i("mobiles",computers.get("computer").toString());
//        computers.put(2,"dell");
//        computers.put(3,"samsung");
//        computers.put(4,"mac");
//        computers.put(5,"hp");
//        Log.i("mobiles",computers.toString());
//        computers.remove(2);
//        computers.size();
//        Log.i("mobiles",computers.toString());
//        Log.i("mobiles",computers.size()+"");


//          findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View v) {
//                  v.setBackgroundColor(Color.GREEN);
//                  findViewById(R.id.linear).setBackgroundColor(Color.BLUE);
//              }
//          });

//           Person person=new Person();
//           Person person1=new Person("shemeer",20,158f);
//           Person person2=new Person("shemeer");

//            Person person=new Person("shemeer",14,250f);
//            Log.i("Name",person.getName());
//            Log.i("Age",person.getAge()+"");
//            person.setName("Naseer");
//        Log.i("Name",person.getName());














    }

    private void GotoNext() {
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }


//    public void onClicked(View buttonView){
//        buttonView.setBackgroundColor(Color.RED);
//        findViewById(R.id.linear).setBackgroundColor(Color.GRAY);
//
//    }
}