package com.example.hazi4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] nevArray = {
            "EUR",
            "USD",
            "HUF",
            "GPB",
            "AUD",
            "DKK",
            "CAD",
            "CHF"
    };
    String[] infoArray = {"Euro",
            "Dollar",
            "Lira",
            "Dollar",
            "Dollar",
            "Franc",
            "Corona",
            "Forint"
    };
    String[] megveszArray = {"4,4100",
            "3,9750",
            "6,1250",
            "2,9600",
            "3,0950",
            "4,2300",
            "0,5850",
            "0,0136"
    };
    String[] eladArray = {"4,5500",
            "3,9750",
            "6,3550",
            "3,0600",
            "3,2650",
            "4,3300",
            "0,6150",
            "0,0146"
    };
    Integer[] kepArray={
            R.drawable.euro,
            R.drawable.usa,
            R.drawable.uk,
            R.drawable.australia,
            R.drawable.canada,
            R.drawable.switzerland,
            R.drawable.denmark,
            R.drawable.hungary
    };
    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomListAdapter listaadapter = new CustomListAdapter( this, kepArray, nevArray, infoArray, megveszArray, eladArray);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(listaadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                TextView textView3 = view.findViewById(R.id.textView3);
                TextView textView4 = view.findViewById(R.id.textView4);
                TextView textView5 = view.findViewById(R.id.textView5);
                TextView textView6 = view.findViewById(R.id.textView6);
                textView3.setVisibility(View.VISIBLE);
                textView4.setVisibility(View.VISIBLE);
                textView5.setVisibility(View.VISIBLE);
                textView6.setVisibility(View.VISIBLE);
            }
        });
    }
}