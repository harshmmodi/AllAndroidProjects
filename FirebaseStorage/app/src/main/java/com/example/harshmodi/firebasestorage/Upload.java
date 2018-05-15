package com.example.harshmodi.firebasestorage;

/**
 * Created by Harsh Modi on 06-10-2017.
 */

public class Upload {

    public String name;
    public String url;
    public String id;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public Upload() {
    }

    public Upload(String name, String url,String id) {
        this.name = name;
        this.url = url;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getId() { return id; }
}