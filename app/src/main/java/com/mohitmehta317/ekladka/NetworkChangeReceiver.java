package com.mohitmehta317.ekladka;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;


public class NetworkChangeReceiver extends BroadcastReceiver {
        public NetworkChangeReceiver receiver;
        public static boolean isConnected = false;

    @Override
        public void onReceive(final Context context, final Intent intent) {
        isNetworkAvailable(context);
        }


        public static boolean isNetworkAvailable(Context context) {
            ConnectivityManager connectivity = (ConnectivityManager)
                    context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (connectivity != null) {
                NetworkInfo[] info = connectivity.getAllNetworkInfo();
                if (info != null) {
                    for (int i = 0; i < info.length; i++) {
                        if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                            if(!isConnected){
                                Toast toast= Toast.makeText(context.getApplicationContext(),"।। अशांति ।।", Toast.LENGTH_SHORT);
                                toast.show();
                                isConnected = true;

                            }
                            return true;
                        }
                    }
                }
            }
            Toast toast= Toast.makeText(context.getApplicationContext(),"।। शान्ति ।।", Toast.LENGTH_SHORT);
            toast.show();
            isConnected = false;
            return false;
        }


    }


