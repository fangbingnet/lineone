package com.example.activitytest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public   class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity","Task id is"+getTaskId());
        setContentView(R.layout.first_layout);
        Button button= (Button)findViewById(R.id.button_1);
       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "you clicked 退出",
                        Toast.LENGTH_SHORT).show();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstActivity.this, SecondActivity.class));
            }
        });*/

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //Intent intent = new Intent("com.example.activitytest.ACTION_START");
              //intent.addCategory("com.example.activitytest.MY_CATEGORY");
            //   FirstActivity.this.startActivity(intent);
              /* Intent intent = new Intent(Intent.ACTION_VIEW);
               intent.setData(Uri.parse("http://www.fangbingnet.com"));
               startActivity(intent);
              Intent intent = new Intent(Intent.ACTION_DIAL);
              intent.setData(Uri.parse("tel:10086"));
               startActivity(intent);
              String  data= "Hello SecondActivity";
              Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
              intent.putExtra("extra_data",data);
            //  intent.putExtra("extra_data",data);
              startActivity(intent);*/

              Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
              intent.putExtra("param1","data1");
              intent.putExtra("param2", "data2");
              startActivity(intent);
           }
       });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "you clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "you clicked Remove",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }


    @Override
    protected  void onActivityResult(int requestCode, int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity", returnedData);
                }
                break;
            default:
        }
    }

    @Override
    protected void onRestart() {

        super.onRestart();
        Log.d("FirstActivity", "onRestart");
    }
}
