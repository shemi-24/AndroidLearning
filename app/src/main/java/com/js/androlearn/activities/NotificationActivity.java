package com.js.androlearn.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
import com.js.androlearn.R;

public class NotificationActivity extends AppCompatActivity {


    EditText title,text;
    Button getNotify;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);


        title=findViewById(R.id.edtTiltle);
        text=findViewById(R.id.edtText);
        getNotify=findViewById(R.id.btnSendNotify);
        getNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(text.getText().toString().isEmpty()||title.getText().toString().isEmpty()){

                    Snackbar.make(v, "No Data Entered!!", Snackbar.LENGTH_LONG)
                            .setAction("Undo", null).show();
                    return;
                }

                showNotification();
            }
        });

    }

    private void showNotification() {

        NotificationCompat.Builder builder=new NotificationCompat.Builder(NotificationActivity.this);
        builder.setSmallIcon(R.drawable.cat);
        builder.setContentTitle(title.getText().toString());
        builder.setContentText(text.getText().toString());


        //User click on notification
        Intent intent=new Intent(NotificationActivity.this,NotificationActivity.class);

        PendingIntent pendingIntent=PendingIntent.getActivity(NotificationActivity.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);

        NotificationManager notificationManager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify("Mynotify",123,builder.build());

    }
}