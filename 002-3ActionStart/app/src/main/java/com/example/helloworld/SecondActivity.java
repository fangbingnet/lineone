package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    public static  void actionStart(Context context, String data1, String data2){
        Intent intent=new Intent(context,SecondActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String data1 ="f";
        data1=intent.getStringExtra("param1");//注意:param1才是获取传递来数据的名称,而且要加引号
        Log.d("fangbing",data1);
        Button button = findViewById(R.id.bt_2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               finish();
            }

        });
    }
}
