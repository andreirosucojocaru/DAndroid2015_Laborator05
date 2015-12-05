package org.rosedu.dandroid.dateandtime.controller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import org.rosedu.dandroid.dateandtime.view.DateAndTimeActivity;

public class DateAndTimeBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent mainActivityIntent = new Intent(context.getApplicationContext(), DateAndTimeActivity.class);
        mainActivityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.getApplicationContext().startActivity(mainActivityIntent);
    }

}
