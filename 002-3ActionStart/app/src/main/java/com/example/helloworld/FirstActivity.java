package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button button = findViewById(R.id.bt_1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //startActivity(intent);
                SecondActivity.actionStart(FirstActivity.this,"fbdata1","data2");
            }

        });
    }
}
