package com.example.android.newsfeed;

public class Article {

    private String mSection;
    private String mTitle;
    private String [] mAuthor;
    private String mDateTime;
    private String mUrl;
    private static final String AUTHOR_SEPARATOR = ", ";


    public Article(String section, String title, String [] author, String dateTime, String url) {
        mSection = section;
        mTitle = title;
        mAuthor = author;
        mDateTime = dateTime;
        mUrl = url;
    }

    public String getSection() {
        return mSection;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        String authors = "";
        for(int i = 0; i < mAuthor.length; i++) {
         if(i < mAuthor.length -1)
            authors += mAuthor[i] + AUTHOR_SEPARATOR;
         else authors += mAuthor[i];
        }
        return authors;
    }

    public String getDateTime() {
        return mDateTime;
    }

    public String getUrl() {
        return mUrl;
    }
}
