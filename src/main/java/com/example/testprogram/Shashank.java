package com.example.testprogram;

/**
 * Created by shashank on 30/4/17.
 */
public class Shashank {
    private static Shashank ourInstance = new Shashank();

    public static Shashank getInstance() {
        return ourInstance;
    }

    private Shashank() {
    }
}
