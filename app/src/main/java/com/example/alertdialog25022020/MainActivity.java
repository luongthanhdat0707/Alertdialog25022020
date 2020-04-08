package com.example.alertdialog25022020;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnshowalert;
    int index = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnshowalert= findViewById(R.id.showalert);

        mBtnshowalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thông báo mới");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setCancelable(false);



                //Mảng con vật
                final String[] arrayAnimals ={"Mèo", "Chó","Heo","Gà"};
                //Single choice lick chọn 1 thuôc tính
                builder.setSingleChoiceItems(arrayAnimals, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        index = which;
                    }
                });
                builder.setPositiveButton("Chọn", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, arrayAnimals[index], Toast.LENGTH_SHORT).show();
                    }
                });

                //Mutiple choice



                        builder.show();
            }
        });
    }
}
