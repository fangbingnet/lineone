package com.mingrisoft.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

   /* //调用（a）
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //定义变量的tempData可以设置为文本框
        String tempData = "Something you just typed";
        outState.putString("data_key",tempData);
    }

    //调用b
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null){
            String tempData = savedInstanceState.getString("data_key");
            //可以用Log/Toast输出
            System.out.println(tempData);
        }
    }
*/


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData = "something you just typed";
        outState.putString("data_key", tempData);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null){
            String tempData =savedInstanceState.getString("data_key");
            Log.d(TAG,tempData);
        }
        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button) findViewById(R.id.start_dialog_activity);
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NormalActivity.class));
            }
        });

        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DialogActivity.class));
            }
        });
    }



    @Override
    protected  void onStart(){
        super.onStart();
        Log.d(TAG,"onStart");
    }
    @Override
    protected  void onResume(){
        super.onResume();
        Log.d(TAG,"onResume");
    }
    @Override
    protected  void onPause(){
        super.onPause();
        Log.d(TAG,"onPause");
    }
    @Override
    protected  void onStop(){
        super.onStop();
        Log.d(TAG,"onStop");
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
    @Override
    protected  void onRestart(){
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

}