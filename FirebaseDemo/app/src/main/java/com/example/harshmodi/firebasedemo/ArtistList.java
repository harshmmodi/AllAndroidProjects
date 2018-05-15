package com.example.harshmodi.firebasedemo;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Harsh Modi on 03-10-2017.
 */

public class ArtistList extends ArrayAdapter<Artist> {

    private Activity context;
    private List<Artist> artistList;

    public ArtistList(Activity context, List<Artist> artistList){
        super(context, R.layout.list_layout, artistList);
        this.context = context;
        this.artistList = artistList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);
        TextView tvName = (TextView)listViewItem.findViewById(R.id.textViewName);
        TextView tvGenre = (TextView)listViewItem.findViewById(R.id.textViewGenre);

        Artist artist = artistList.get(position);
        tvName.setText(artist.getArtistName());
        tvGenre.setText(artist.getArtistGenre());

        return listViewItem;



    }
}
