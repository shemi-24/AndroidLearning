package com.js.androlearn.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewAnimator;
import android.widget.ViewFlipper;

import com.js.androlearn.R;
import com.js.androlearn.models.Animal;

public class ViewFlipperAnimatorActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    ImageButton Next, Previous;
    ViewAnimator viewAnimator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_flipper_animator);


        Next = findViewById(R.id.btnAnimalImageNext);
        Previous = findViewById(R.id.btnAnimalImagePrevious);
        viewFlipper = findViewById(R.id.viewFlipper);
        viewAnimator = findViewById(R.id.viewAnimator);

        letsAddTheImagesToTheViewFlipper(viewFlipper);
        letsAddTheImagesToTheViewAnimator(viewAnimator);

        useAnimationForViewFlipper(viewFlipper);
        useAnimationForViewAnimator(viewAnimator);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
                viewAnimator.showNext();
            }
        });

        Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.showPrevious();
                viewAnimator.showPrevious();
            }
        });






    }

    public void letsSetLayoutParamsForImageView(ImageView imageView) {
        imageView.setLayoutParams(new LinearLayout.LayoutParams(1000, 1000));
    }

    public void letsAddTheImagesToTheViewFlipper(ViewFlipper viewFlipper) {
        for (int i = 0; i < Animal.animalImages.length; i++) {
            ImageView imageView = new ImageView(ViewFlipperAnimatorActivity.this);
            imageView.setImageResource(Animal.animalImages[i]);
            letsSetLayoutParamsForImageView(imageView);
            imageView.setPadding(100, 100, 100, 100);
            viewFlipper.addView(imageView);
        }
    }

    public void letsAddTheImagesToTheViewAnimator(ViewAnimator viewAnimator) {
        for (int i = 0; i < Animal.animalImages.length; i++) {
            ImageView imageView = new ImageView(ViewFlipperAnimatorActivity.this);
            imageView.setImageResource(Animal.animalImages[i]);
            letsSetLayoutParamsForImageView(imageView);
            imageView.setPadding(100, 100, 100, 100);
            viewAnimator.addView(imageView);
        }
    }

    private void useAnimationForViewFlipper(ViewFlipper viewFlipper){
        viewFlipper.setInAnimation(AnimationUtils.loadAnimation(ViewFlipperAnimatorActivity.this, android.R.anim.slide_in_left));
        viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(ViewFlipperAnimatorActivity.this, android.R.anim.slide_out_right));

    }
    private void useAnimationForViewAnimator(ViewAnimator viewAnimator){
        viewAnimator.setInAnimation(AnimationUtils.loadAnimation(ViewFlipperAnimatorActivity.this, android.R.anim.fade_in));
        viewAnimator.setOutAnimation(AnimationUtils.loadAnimation(ViewFlipperAnimatorActivity.this, android.R.anim.fade_out));

    }




}