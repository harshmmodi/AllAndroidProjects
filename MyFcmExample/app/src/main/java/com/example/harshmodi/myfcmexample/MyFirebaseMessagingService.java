package com.example.harshmodi.myfcmexample;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Harsh Modi on 18-10-2017.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG =  "fcmMessage";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // ...

        // TODO(developer): Handle FCM messages here.
        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        Log.d(TAG, "From: " + remoteMessage.getFrom());

        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
           // Toast.makeText(getBaseContext(), "Payload", Toast.LENGTH_LONG).show();
            Log.d(TAG, "Message data payload: " + remoteMessage.getData());
        }

        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) {
            Toast.makeText(getBaseContext(), "Mesg Recd", Toast.LENGTH_LONG).show();
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
        }

        notifyUser(remoteMessage.getFrom(), remoteMessage.getNotification().getBody());

        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
    }
    public void notifyUser(String from, String notification){
        MyNotificationManager myNotificationManager = new MyNotificationManager(getApplicationContext());
        myNotificationManager.showNotification(from, notification, new Intent(getApplicationContext(), MainActivity.class));

    }
}
