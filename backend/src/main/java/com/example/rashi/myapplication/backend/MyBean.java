package com.example.rashi.myapplication.backend;


import com.example.jokeSmith;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        jokeSmith joker = new jokeSmith();
        myData = joker.getJoke();
        return myData;
    }

    public void setData(String data) {


    }
}