package com.example.hazi5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] lista={"alma","korte","barack","dinye","eper","malna","banan","mango","kivi","csereszne"};
    List<String> list=new ArrayList<String>(Arrays.asList(lista));
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        ListView listView=(ListView) findViewById(R.id.listviewID);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        View view = info.targetView;
        TextView txt1 = (TextView) view.findViewById(android.R.id.text1);
        switch (item.getItemId()) {
            case R.id.SzinPiros:
                txt1.setTextColor(Color.RED);
                return true;
            case R.id.SzinSarga:
                txt1.setTextColor(Color.YELLOW);
                return true;
            case R.id.SzinZold:
                txt1.setTextColor(Color.GREEN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.rendez:
                Collections.sort(list, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareToIgnoreCase(o2);
                    }
                });
                adapter.notifyDataSetChanged();
                return true;
            case R.id.torol:
                list.clear();
                adapter.notifyDataSetChanged();
                return true;
            default:
                 return super.onOptionsItemSelected(item);
        }

    }
}