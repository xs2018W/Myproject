package com.example.a43;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView)findViewById(R.id.textview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.menuform,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.small_type:
                textview.setTextSize(5*2);
                break;
            case R.id.middle_type:
                textview.setTextSize(15*2);
                break;
            case R.id.largest_type:
                textview.setTextSize(20*2);
                break;
            case R.id.normal:
                Toast.makeText(this, "这是普通菜单项", Toast.LENGTH_SHORT).show();
                break;
            case R.id.red_color:
                textview.setTextColor(Color.RED);
                break;
            case R.id.black_color:
                textview.setTextColor(Color.BLACK);
                break;
        }
        return true;
    }
}
