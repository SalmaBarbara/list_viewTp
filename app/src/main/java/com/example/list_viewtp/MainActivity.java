package com.example.list_viewtp;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final ArrayList<Item>  items = new ArrayList<Item>();
        items.add(new Item(R.drawable.pdp, "Message 1",R.drawable.account));
        items.add(new Item(R.drawable.pdp, "Message 2",R.drawable.account));
        items.add(new Item(R.drawable.pdp, "Message 3",R.drawable.account));





        CustomAdapter adapter = new CustomAdapter(this, items);
        ListView  listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
