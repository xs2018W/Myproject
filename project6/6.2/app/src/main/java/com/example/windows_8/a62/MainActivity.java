package com.example.windows_8.a62;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText newurl;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newurl = (EditText)findViewById(R.id.internet);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String url = newurl.getText().toString();
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.putExtra("url", "http://www.baidu.com");
                PackageManager pm = getPackageManager();
                List<ResolveInfo> resolveList = pm.queryIntentActivities(intent, PackageManager.MATCH_ALL);
                Log.i("MainActivity", "resolveList size:"+resolveList.size());
                if(resolveList.size() > 0) {
                    String title = "choose application";
                    Intent intentChooser = Intent.createChooser(intent, title);
                    startActivity(intentChooser);
                }else {
                    Toast.makeText(MainActivity.this, "no match activity to start!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}