package com.example.a41;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {

    private String[] names = new String[]{"Lion", "Tiger", "Monkey","Dog","Cat","Elephant"};
    private int[] imgIds = new int[]{R.mipmap.lion, R.mipmap.tiger, R.mipmap.monkey, R.mipmap.dog,R.mipmap.cat,R.mipmap.elephant};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Map<String, Object>> listitem = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> showitem = new HashMap<String, Object>();
            showitem.put("picture", imgIds[i]);
            showitem.put("name", names[i]);
            listitem.add(showitem);
        }

        //创建一个simpleAdapter
        SimpleAdapter myAdapter = new SimpleAdapter(this, listitem, R.layout.activity_main, new String[]{"name", "picture"}, new int[]{R.id.name, R.id.picture});
        ListView listView = (ListView) findViewById(R.id.list_test);
        listView.setAdapter(myAdapter);


    //perform listView item click event
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(getApplicationContext(),names[i],Toast.LENGTH_LONG).show();//show the selected image in toast according to position
        }
    });
}
}
