package com.example.yegon.simpaypos;

/**
 * Created by Yegon on 1/20/2016.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class myreceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,intent.getStringExtra("message"), Toast.LENGTH_LONG).show();
    }
}