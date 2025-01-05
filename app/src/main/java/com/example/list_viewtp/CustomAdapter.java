package com.example.list_viewtp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Item> {

    public CustomAdapter(@NonNull Context context, ArrayList<Item> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = convertView.findViewById(R.id.imageView);
            viewHolder.textView = convertView.findViewById(R.id.textView);
            viewHolder.iconView = convertView.findViewById(R.id.iconView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Item currentItem = getItem(position);

        if (currentItem != null) {
            viewHolder.imageView.setImageResource(currentItem.getImageResId());
            viewHolder.textView.setText(currentItem.getText());
            viewHolder.iconView.setImageResource(currentItem.getIconId());
        }

        return convertView;
    }

    static class ViewHolder {
        ImageView imageView;
        TextView textView;
        ImageView iconView;
    }
}
