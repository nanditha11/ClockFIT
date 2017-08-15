package com.example.dyuthi.fit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        expandableListView = (ExpandableListView)findViewById(R.id.expandlist);
        List<String> Headings = new ArrayList<>();
        List<String> L1 = new ArrayList<>();
        List<String> L2 = new ArrayList<>();
        List<String> L3 = new ArrayList<>();
        List<String> L4 = new ArrayList<>();
        List<String> L5 = new ArrayList<>();
        List<String> L6 = new ArrayList<>();
        List<String> L7 = new ArrayList<>();
        List<String> L8 = new ArrayList<>();
        List<String> L9 = new ArrayList<>();
        List<String> L10 = new ArrayList<>();
        List<String> L11 = new ArrayList<>();

        HashMap<String,List<String>> childlist = new HashMap<>();
        String headingitems[] = getResources().getStringArray(R.array.place_array);
        String l1[] = getResources().getStringArray(R.array.h1_items);
        String l2[] = getResources().getStringArray(R.array.h2_items);
        String l3[] = getResources().getStringArray(R.array.h3_items);
        String l4[] = getResources().getStringArray(R.array.h4_items);
        String l5[] = getResources().getStringArray(R.array.h5_items);
        String l6[] = getResources().getStringArray(R.array.h6_items);
        String l7[] = getResources().getStringArray(R.array.h7_items);
        String l8[] = getResources().getStringArray(R.array.h8_items);
        String l9[] = getResources().getStringArray(R.array.h9_items);
        String l10[] = getResources().getStringArray(R.array.h10_items);
        String l11[] = getResources().getStringArray(R.array.h11_items);

        for(String title:headingitems){Headings.add(title);}
        for(String title:l1){L1.add(title);}
        for(String title:l2){L2.add(title);}
        for(String title:l3){L3.add(title);}
        for(String title:l4){L4.add(title);}
        for(String title:l5){L5.add(title);}
        for(String title:l6){L6.add(title);}
        for(String title:l7){L7.add(title);}
        for(String title:l8){L8.add(title);}
        for(String title:l9){L9.add(title);}
        for(String title:l10){L10.add(title);}
        for(String title:l11){L11.add(title);}

        childlist.put(Headings.get(0),L1);
        childlist.put(Headings.get(1),L2);
        childlist.put(Headings.get(2),L3);
        childlist.put(Headings.get(3),L4);
        childlist.put(Headings.get(4),L5);
        childlist.put(Headings.get(5),L6);
        childlist.put(Headings.get(6),L7);
        childlist.put(Headings.get(7),L8);
        childlist.put(Headings.get(8),L9);
        childlist.put(Headings.get(9),L10);
        childlist.put(Headings.get(10),L11);

        Adapter adapter = new Adapter(this,Headings,childlist);
        expandableListView.setAdapter(adapter);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
