package com.js.androlearn.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.js.androlearn.R;

public class CustomizeListAdapter extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater;



    int[] animalImages={R.drawable.bear,R.drawable.bird,R.drawable.cat,R.drawable.cow,R.drawable.dolphin,R.drawable.fish,R.drawable.fox,R.drawable.horse,R.drawable.lion,R.drawable.tiger};

    String[] animalNames={"Bear","Bird","Cat","Cow","Dolphin","Fish","Fox","Horse","Lion","Tiger"};
    int[] animalPower={200,20,50,150,50,10,70,400,250,220};
    int[] animalSpeed={50,80,60,10,50,40,80,350,200,100};
    public CustomizeListAdapter(Context context){
        this.context=context;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



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

        convertView=layoutInflater.inflate(R.layout.customize_listview,null);
        ImageView imgAnimal=convertView.findViewById(R.id.imgAnimal);
        TextView txtAnimalName=convertView.findViewById(R.id.textView);
        TextView txtAnimalPower=convertView.findViewById(R.id.textView2);
        TextView txtAnimalSpeed=convertView.findViewById(R.id.textView3);

        String oldTxtAnimalPower=txtAnimalPower.getText().toString();
        String oldTxtAnimalSpeed=txtAnimalSpeed.getText().toString();

        //imgAnimal.setImageResource(animalImages[position]);
        //reduce the size of images
//        final BitmapFactory.Options options=new BitmapFactory.Options();
//        options.inSampleSize=10;
//        Bitmap bitmap=BitmapFactory.decodeResource(context.getResources(),animalImages[position]);
//        imgAnimal.setImageBitmap(bitmap);


        Bitmap bm = decodeSampledBitmapFromResource(context.getResources(), animalImages[position], 50, 50);
        imgAnimal.setImageBitmap(bm);

        txtAnimalName.setText(animalNames[position]);
        txtAnimalPower.setText(oldTxtAnimalPower + ": " + animalPower[position] + "");
        txtAnimalSpeed.setText(oldTxtAnimalSpeed + ": " + animalSpeed[position] + "");

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(context, "The name of the Animal is" + txtAnimalName.getText(), Toast.LENGTH_SHORT).show();

            }
        });


        return convertView;

    }
    public static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) > reqHeight
                    && (halfWidth / inSampleSize) > reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }
    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
                                                         int reqWidth, int reqHeight) {

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }

}
