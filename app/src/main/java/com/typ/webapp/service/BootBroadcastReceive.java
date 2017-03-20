package com.typ.webapp.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.typ.webapp.MainActivity;

/**
 * Created by tangyiping on 2017/3/20.
 */

public class BootBroadcastReceive extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"启动啦啦啦啦啦啦啦",Toast.LENGTH_SHORT).show();
        Intent startIntent = new Intent(context, MainActivity.class);
        startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(startIntent);
    }
}
