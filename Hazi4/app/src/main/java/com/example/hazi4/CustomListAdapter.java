package com.example.hazi4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;

    private final Integer[] kepIDattay;

    private final String[] nev;

    private final String[] penz;

    private final String[] elad;

    private final String[] megvesz;


    public CustomListAdapter(Activity context, Integer[] kepIDattay,String[]nev,String[] penz,String[] elad,String[] megvesz) {

        super(context,R.layout.listview_row,nev);

        this.context=context;
        this.kepIDattay = kepIDattay;
        this.nev = nev;
        this.penz = penz;
        this.elad = elad;
        this.megvesz = megvesz;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.listview_row,null,true);

        ImageView image = (ImageView) rowView.findViewById(R.id.imageView);
        TextView nev1 = (TextView) rowView.findViewById(R.id.textView);
        TextView penz1 = (TextView) rowView.findViewById(R.id.textView2);
        TextView megvesz1 = (TextView) rowView.findViewById(R.id.textView6);
        TextView elad1 = (TextView) rowView.findViewById(R.id.textView5);

        image.setImageResource(kepIDattay[position]);
        nev1.setText(nev[position]);
        penz1.setText(penz[position]);
        megvesz1.setText(megvesz[position]);
        elad1.setText(elad[position]);

        return rowView;
    }


}
