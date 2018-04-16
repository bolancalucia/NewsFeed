package com.example.android.newsfeed;

public class Article {

    private String mSection;
    private String mTitle;
    private String mdateTime;
    private String mUrl;

    public Article(String section, String title, String dateTime, String url) {
        mSection = section;
        mTitle = title;
        mdateTime = dateTime;
        mUrl = url;
    }

    public String getSection() {
        return mSection;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDateTime() {
        return mdateTime;
    }

    public String getUrl() {
        return  mUrl;
    }
}
