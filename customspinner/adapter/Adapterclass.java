package com.solution.customspinner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.solution.customspinner.R;
import com.solution.customspinner.model.Model;

import java.util.ArrayList;
import java.util.List;

public class Adapterclass extends ArrayAdapter<Model> {
   List<Model> algorithmItems;

    public Adapterclass(@NonNull Context context, @NonNull List<Model> algorithmItems) {
        super(context, 0, algorithmItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);
    }



    private View initView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.spinneractivity,parent,false);
        }
        ImageView imageView=convertView.findViewById(R.id.imageview);
        TextView textViewName = convertView.findViewById(R.id.text_view);
        Model currentItem = getItem(position);

        if (currentItem != null) {
            imageView.setImageResource(currentItem.getImg1());
            textViewName.setText(currentItem.getSpinnertext());
        }
        return convertView;
    }
}
