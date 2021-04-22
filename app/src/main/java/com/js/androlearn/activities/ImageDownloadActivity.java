package com.js.androlearn.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.js.androlearn.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ImageDownloadActivity extends AppCompatActivity {

    ImageView imageView;
    Button btnImageDownload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_download);

        imageView=findViewById(R.id.imageView);
        btnImageDownload =findViewById(R.id.btnDownload);
        btnImageDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DownloadImageTask downloadImageTask=new DownloadImageTask(ImageDownloadActivity.this);
                downloadImageTask.execute("https://ilinks.io/static/images/main.webp");
            }
        });


    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {



        ProgressDialog progressDialog;
        Context context;

        DownloadImageTask(Context context){
            this.context=context;
            progressDialog=new ProgressDialog(context);

        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog.setMessage("Downloading Image.......");
            progressDialog.show();
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            String stringUrl=strings[0];
            Bitmap bitmap=null;

            try {
                URL url=new URL(stringUrl);
                InputStream inputStream=url.openStream();
                bitmap= BitmapFactory.decodeStream(inputStream);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            imageView.setImageBitmap(bitmap);

            if(progressDialog.isShowing()){
                progressDialog.dismiss();
            }
        }
    }
}