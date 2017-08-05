package com.example.swarathesh60.listviewcustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lists;
    ArrayList<Details> detailses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lists = (ListView) findViewById(R.id.list);
        detailses = new ArrayList<>();
        detailses.add(new Details("swarathesh","addanki"));
        detailses.add(new Details("swarathesh","addanki"));
        detailses.add(new Details("swarathesh","addanki"));
        detailses.add(new Details("swarathesh","addanki"));
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.list_row,detailses);
        lists.setAdapter(customAdapter);
    }
}
