/**
 * Copyright (c) 2015 Bookmate.
 * All Rights Reserved.
 * <p/>
 * Author: Dmitry Gordeev <netimen@dreamindustries.co>
 * Date:   09.10.15
 */
package ru.netimen.androidsandbox;

import android.Manifest;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

import com.tbruyelle.rxpermissions.RxPermissions;
import com.trello.rxlifecycle.ActivityEvent;
import com.trello.rxlifecycle.RxLifecycle;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;


@EActivity(R.layout.activity_m_permissions)
//@RuntimePermissions
public class MPermissionsActivity extends AppCompatActivity {

    public static final String permissions[] = {Manifest.permission.READ_PHONE_STATE, Manifest.permission.ACCESS_FINE_LOCATION};
    private static final int REQUEST_CODE_ASK_PERMISSIONS = 1;
    private static final String LOG_TAG = MPermissionsActivity.class.getSimpleName();

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(LOG_TAG, "AAAA onResume " + this);
    }

    @Click
    void testPermissions() {
//        checkPermissionsVanillaAndroid();
        Log.e(LOG_TAG, "AAAA test " + MPermissionsActivity.this);
        RxPermissions.getInstance(this).request(permissions)
                .subscribe(new Action1<Boolean>() {
                    @Override
                    public void call(Boolean granted) {
                        Log.e(LOG_TAG, "AAAA granted " + MPermissionsActivity.this + " " + granted);
                        if (granted)
                            doSomethingNeedingPermissions();
                        else
                            Toast.makeText(MPermissionsActivity.this, "Some permissions not granted", Toast.LENGTH_LONG).show();
                    }
                });
    }

    private void checkPermissionsVanillaAndroid() {
        final List<String> permissionsToGet = new ArrayList<>(), permissionsToExplain = new ArrayList<>();
        for (String permission : permissions)
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
                permissionsToGet.add(permission);
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, permission))
                    permissionsToExplain.add(permission);
            }

        if (permissionsToGet.size() > 0) {
            if (permissionsToExplain.size() > 0)
                showMessageOKCancel("You need these permissions: " + permissionsToExplain.toString(), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                ActivityCompat.requestPermissions(MPermissionsActivity.this, permissionsToGet.toArray(new String[permissionsToGet.size()]), REQUEST_CODE_ASK_PERMISSIONS);
                            }
                        }
                );
            else
                ActivityCompat.requestPermissions(this, permissionsToGet.toArray(new String[permissionsToGet.size()]), REQUEST_CODE_ASK_PERMISSIONS);
        }
    }

    private void showMessageOKCancel(String message, DialogInterface.OnClickListener okListener) {
        new AlertDialog.Builder(this)
                .setMessage(message)
                .setPositiveButton("OK", okListener)
                .setNegativeButton("Cancel", null)
                .create()
                .show();
    }

    //    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case REQUEST_CODE_ASK_PERMISSIONS:
                List<String> permissionsNotGranted = new ArrayList<>();
                for (int i = 0; i < grantResults.length; i++)
                    if (grantResults[i] != PackageManager.PERMISSION_GRANTED)
                        permissionsNotGranted.add(permissions[i]);
                if (permissionsNotGranted.size() > 0)
                    Toast.makeText(this, "You still need these permissions: " + permissionsNotGranted.toString(), Toast.LENGTH_LONG).show();
                else
                    doSomethingNeedingPermissions();
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

//    @NeedsPermissions({Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.READ_PHONE_STATE})
    void doSomethingNeedingPermissions() {
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        if (telephonyManager != null)
            telephonyManager.getDeviceId();

        LocationManager locManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        locManager.getLastKnownLocation("gps");
    }
}
