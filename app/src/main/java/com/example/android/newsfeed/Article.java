package com.example.android.newsfeed;

public class Article {

    private String mSection;
    private String mTitle;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Article(String section, String title, long timeInMilliseconds, String url) {
        mSection = section;
        mTitle = title;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public String getSection() {
        return mSection;
    }

    public String getTitle() {
        return mTitle;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return  mUrl;
    }
}
