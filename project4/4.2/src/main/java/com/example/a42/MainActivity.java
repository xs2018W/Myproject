package com.example.a42;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button showdialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showdialog = (Button)findViewById(R.id.button);
        showdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogview();
            }
        });
    }

    public void dialogview(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        builder.setView(inflater.inflate(R.layout.loginform, null))

                .setPositiveButton(R.string.login, new OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        showdialog.setText("单击了【登陆】按钮！");
                    }
                })
                .setNegativeButton(R.string.cancel, new OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        showdialog.setText("单击了【取消】按钮！");
                    }
                });
        builder.create();
        builder.show();
    }
}


