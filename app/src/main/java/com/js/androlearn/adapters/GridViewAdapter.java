package com.js.androlearn.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.js.androlearn.R;

public class GridViewAdapter extends BaseAdapter {

    Context context;


    public GridViewAdapter(Context context){
        this.context=context;

    }

    int[] animalImages={R.drawable.bear,R.drawable.bird,R.drawable.cat,R.drawable.cow,R.drawable.dolphin,R.drawable.fish,R.drawable.fox,R.drawable.horse,R.drawable.lion,R.drawable.tiger};

    String[] animalNames={"Bear","Bird","Cat","Cow","Dolphin","Fish","Fox","Horse","Lion","Tiger"};




    @Override
    public int getCount() {
        return animalImages.length;
    }

    @Override
    public Object getItem(int position) {
        return animalImages[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView=new ImageView(context);
        imageView.setImageResource(animalImages[position]);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(300,300));
        imageView.setPadding(10,10,10,10);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "The Name of the Animal is:"+animalNames[position], Toast.LENGTH_SHORT).show();
            }
        });
        return imageView;
    }
}
