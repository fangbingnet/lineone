package com.example.broadcasttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.provider.ContactsContract.Intents.Insert.ACTION;

public class MainActivity extends AppCompatActivity {
    private MyBroadcastReceiver myBroadcastReceiver;
  private IntentFilter intentFilter;
 //   private MainActivity.NetworkChangeReceiver networkChangeReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentFilter = new IntentFilter();
                intentFilter.addAction("1");
                myBroadcastReceiver = new MyBroadcastReceiver();
                registerReceiver(myBroadcastReceiver,intentFilter);

            }
        });
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        unregisterReceiver(myBroadcastReceiver);
    }
    class MyBroadcastReceiver extends  BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context,"received in MyBroadcastReceiver", Toast.LENGTH_LONG).show();
        }
    }

/*
       intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        networkChangeReceiver = new MainActivity.NetworkChangeReceiver();
        registerReceiver(networkChangeReceiver, intentFilter);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        unregisterReceiver(networkChangeReceiver);
    }
    class NetworkChangeReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent){
            ConnectivityManager connectionManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectionManager.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isAvailable()){
                Toast.makeText(context,"network is available",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(context,"network is unavailable",Toast.LENGTH_SHORT).show();

            }
            // Toast.makeText(context,"network changes",Toast.LENGTH_SHORT).show();
        }*/




}
