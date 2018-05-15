package com.example.harshmodi.firebasedemo;

/**
 * Created by Harsh Modi on 03-10-2017.
 */

public class Artist {
    String artistId;
    String artistName;
    String artistGenre;

    public Artist(){

    }

    public Artist(String artistId, String artistName, String artistGenre) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }
}


