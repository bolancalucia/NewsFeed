package com.example.android.newsfeed;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class NewsAdapter extends ArrayAdapter<Article> {

    private static final String DATETIME_SEPARATOR = "T";

    public NewsAdapter(Context context, ArrayList<Article> articles) {
        super(context,0, articles);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext())
                        .inflate(R.layout.list_item, parent,false);
        }
        Article currentArticle = getItem(position);

        TextView section = convertView.findViewById(R.id.section);
        section.setText(currentArticle.getSection());
        TextView title = convertView.findViewById(R.id.title);
        title.setText(currentArticle.getTitle());

        TextView date = convertView.findViewById(R.id.date);
        TextView time = convertView.findViewById(R.id.time);
        String dateTime = currentArticle.getDateTime();

        if(dateTime.contains(DATETIME_SEPARATOR)) {
            int index = dateTime.indexOf(DATETIME_SEPARATOR);
            date.setText(dateTime.substring(0,index));
            time.setText(dateTime.substring(index+1,dateTime.length()-1));
        }
        return convertView;
    }
}
