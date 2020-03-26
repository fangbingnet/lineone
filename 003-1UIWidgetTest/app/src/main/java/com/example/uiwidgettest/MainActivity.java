package com.example.uiwidgettest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progress_bar);
        imageView = findViewById(R.id.image_view);
        editText = findViewById(R.id.edit_text);
        Button button =findViewById(R.id.btn_1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String inputText = editText.getText().toString();
              //  Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
               // imageView.setImageResource(R.drawable.img_2);
               /* if(progressBar.getVisibility() == View.GONE){
                    progressBar.setVisibility(View.VISIBLE);
                }else{
                    progressBar.setVisibility(View.GONE);
                }
               int progress = progressBar.getProgress();
               progress = progress + 10;
               if (progress==100)
                   progress=0;
               progressBar.setProgress(progress);*/

               AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is a dialog");
                dialog.setMessage("Something is important.");
                dialog.setCancelable(false);
                dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();

               /* ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is Progressdialog");
                progressDialog.setMessage("Loading.........");
                progressDialog.setCancelable(true);
                progressDialog.show();*/
            }
        });
    }

    //public void onClick(View v) {

     //           Toast.makeText(MainActivity.this, "you clicked button", Toast.LENGTH_SHORT).show();

   // }

}
