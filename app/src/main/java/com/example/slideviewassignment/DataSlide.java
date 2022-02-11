package com.example.slideviewassignment;

import java.lang.reflect.Constructor;

public class DataSlide {
    private int ImgeUrl;
    private String text;

    public DataSlide(){
    }

    public DataSlide(int imgeUrl, String text) {
        ImgeUrl = imgeUrl;
        this.text = text;
    }

    public int getImgeUrl() {
        return ImgeUrl;
    }

    public void setImgeUrl(int imgeUrl) {
        ImgeUrl = imgeUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text)  {
        this.text = text;
    }
}