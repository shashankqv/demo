package com.example.testprogram;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;
import java.util.zip.DeflaterOutputStream;

/**
 * Created by shashank on 29/4/17.
 */
public class TestDataStructure {

    public String getMyName(){
        return "Shashank Vivek";
    }

    public static void main(String args[]){
       String name = "Shashank Vivek";
       int iAmInt = 123;
       Double iAmDouble = 2222.00D;
       boolean iAmBoolean = Boolean.TRUE;
       System.out.println("i am here");
       System.out.println(name);
       System.out.println(iAmInt);
       System.out.println(iAmDouble);
       System.out.println(iAmBoolean);


    }
}
