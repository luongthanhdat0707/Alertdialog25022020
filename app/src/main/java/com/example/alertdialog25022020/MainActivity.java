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
                builder.setMessage("Bạn vừa nhận tin nhắn mới");
                builder.setIcon(R.mipmap.ic_launcher);

                //Button Xác nhận
                builder.setPositiveButton("có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Có", Toast.LENGTH_SHORT).show();
                    }
                });

                //Button Từ chối
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Không", Toast.LENGTH_SHORT).show();
                            }
                });

                //Button Hủy
                builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Hủy", Toast.LENGTH_SHORT).show();
                    }
                });


                        builder.show();
            }
        });
    }
}
