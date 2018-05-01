package com.ingidear.poolmonitor.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class TRTLService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     */
    public TRTLService() {
        super("TRTLIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String action = intent.getAction();
        ReminderTasks.executeTasks(this, action);
    }
}
