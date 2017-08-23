package com.example.yvtc.yvtc082301;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NotificationManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    }
    public void click1(View v)
    {
        Notification.Builder builder = new Notification.Builder(MainActivity.this);
        builder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("這是提醒")
                .setContentText("這是提醒的內容")
                .setOngoing(true);
        manager.notify(321, builder.build());
    }
    public void onCancel(View v)
    {
        manager.cancel(321);
    }
}
