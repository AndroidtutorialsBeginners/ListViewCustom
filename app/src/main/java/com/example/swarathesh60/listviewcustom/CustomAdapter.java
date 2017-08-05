package com.example.swarathesh60.listviewcustom;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by swarathesh60 on 5/8/17.
 */

public class CustomAdapter extends ArrayAdapter<Details> {
    List<Details> details;
    Context mcontext;
    public CustomAdapter(@NonNull Context context, @LayoutRes int resource , @NonNull List<Details> details) {
        super(context, resource,details);
        this.mcontext = context;
        this.details = details;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View view = LayoutInflater.from(mcontext).inflate(R.layout.list_row,null);
        TextView name , de;
        name = (TextView) view.findViewById(R.id.name);
        de = (TextView) view.findViewById(R.id.details);
        Details details1 = details.get(position);
        name.setText(details1.getAuthor());
        de.setText(details1.getDetails());

        return view;
    }
}
