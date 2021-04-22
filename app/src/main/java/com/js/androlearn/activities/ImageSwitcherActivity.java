package com.js.androlearn.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.js.androlearn.R;
import com.js.androlearn.models.Animal;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

public class ImageSwitcherActivity extends AppCompatActivity {


    LinearLayout linearLayoutHorizontal;
    ImageSwitcher imageSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_swatcher);


        linearLayoutHorizontal = findViewById(R.id.linearLayoutHorizontal);
        imageSwitcher = findViewById(R.id.imgSwitcher);


            imageSwitcher.setFactory(() -> {
                ImageView imgView = new ImageView(ImageSwitcherActivity.this);
                imgView.setScaleType(ImageView.ScaleType.FIT_XY);
                imgView.setLayoutParams(new ViewGroup.LayoutParams(MATCH_PARENT,MATCH_PARENT));
                return imgView;
            });


        for (int i = 0; i < Animal.animalImages.length; i++) {
            final int index = i;
            ImageView imageView = new ImageView(ImageSwitcherActivity.this);
            imageView.setImageResource(Animal.animalImages[i]);
            letsSetLayoutParamsForImageView(imageView);
            imageView.setPadding(100, 100, 100, 100);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imageSwitcher.setImageResource(Animal.animalImages[index]);
                    Toast.makeText(ImageSwitcherActivity.this, "This is " + Animal.animalNames[index], Toast.LENGTH_SHORT).show();
                }
            });
            linearLayoutHorizontal.addView(imageView);
        }






    }

    public void letsSetLayoutParamsForImageView(ImageView imageView) {
        imageView.setLayoutParams(new LinearLayout.LayoutParams(1000,1000));
    }
}


//import android.app.Activity;
//import android.app.ActionBar.LayoutParams;
//import android.os.Bundle;
//import android.view.View;
//
//import android.widget.Button;
//import android.widget.ImageSwitcher;
//import android.widget.ImageView;
//import android.widget.Toast;
//import android.widget.ViewSwitcher.ViewFactory;
//
//public class ImageSwitcherActivity extends Activity {
//    private ImageSwitcher sw;
//    private Button b1,b2;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        b1 = (Button) findViewById(R.id.button);
//        b2 = (Button) findViewById(R.id.button2);
//
//        sw = (ImageSwitcher) findViewById(R.id.imageSwitcher);
//        sw.setFactory(new ViewFactory() {
//            @Override
//            public View makeView() {
//                ImageView myView = new ImageView(getApplicationContext());
//                myView.setScaleType(ImageView.ScaleType.FIT_CENTER);
//                myView.setLayoutParams(new
//                        ImageSwitcher.LayoutParams(LayoutParams.WRAP_CONTENT,
//                        LayoutParams.WRAP_CONTENT));
//                return myView;
//            }
//        });
//
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "previous Image",
//                        Toast.LENGTH_LONG).show();
//                sw.setImageResource(R.drawable.tiger);
//            }
//        });
//
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Next Image",
//                        Toast.LENGTH_LONG).show();
//                sw.setImageResource(R.drawable.lion);
//            }
//        });
//    }
//}
//
//
//
//
//
