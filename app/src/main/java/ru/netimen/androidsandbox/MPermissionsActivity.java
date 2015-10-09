/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   09.10.15
 */
package ru.netimen.androidsandbox;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EActivity;

@EActivity
public class MPermissionsActivity extends AppCompatActivity {
    @AfterInject
    void ready() {
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        if (telephonyManager != null) {
            telephonyManager.getDeviceId();
        }
    }
}
