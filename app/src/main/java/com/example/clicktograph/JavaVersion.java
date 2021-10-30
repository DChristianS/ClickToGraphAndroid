package com.example.clicktograph;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class JavaVersion /*{
    public class MainActivity*/ extends AppCompatActivity {

        ProgressBar pb_01;
        Button btn_01;
        int i = 1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            pb_01 = (ProgressBar)findViewById(R.id.progressBar);
            pb_01.setMax(3);
            TextView tv_01 = (TextView)findViewById(R.id.tv_1);
            btn_01 = (Button)findViewById(R.id.btn_ClickMe);
            btn_01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i++;
                    if(i >= pb_01.getMax()){
                        if (tv_01.getText().equals("Hello World!")) {
                            tv_01.setText("Hi");
                            Toast.makeText(getApplicationContext(), "Leiste ist voll", Toast.LENGTH_SHORT).show();
                        }else{
                            tv_01.setText("Hello World!");
                            alertDialog();
                        }
                        i = 0;
                    }
                    //pb_01.setProgress(i, i > 20);
                    pb_01.setProgress(i);
                }
            });

        }

        private void alertDialog() {
            AlertDialog ad = new AlertDialog.Builder(this).create();
            ad.setMessage("Leiste voll");
            ad.show();
        }
    }

