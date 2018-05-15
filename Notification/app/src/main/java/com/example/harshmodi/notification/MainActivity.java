package com.example.harshmodi.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.RemoteViews;

public class MainActivity extends AppCompatActivity {

    Button b1;
    private NotificationCompat.Builder builder;
    private NotificationManager notificationManager;
    private int notification_id;
    private RemoteViews remoteViews;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

        b1 = (Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notification_intent = new Intent(context, MainActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(context,0, notification_intent, 0);
                builder = new NotificationCompat.Builder(context);
                builder.setSmallIcon(R.drawable.ic_action_name);
                builder.setContentTitle("fees");
                builder.setContentText("ABCDDSD");
                builder.setAutoCancel(true);
                builder.setContentIntent(pendingIntent);
                notificationManager.notify(notification_id, builder.build());


            }
        });
    }
}
