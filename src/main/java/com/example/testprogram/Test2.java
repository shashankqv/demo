package com.example.testprogram;

import org.aspectj.weaver.ast.Test;

import java.sql.Array;
import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by shashank on 29/4/17.
 */
public class Test2 extends TestDataStructure {

    public static void main(String args[]) {
        Test2 test2 = new Test2();
        test2.getMyName();
        System.out.println(test2.getMyName());
        // These are collections...
        List<String> myList = new ArrayList<String>();
        myList.add("Shashank");
        myList.add("Vivek");

        List<String> myList1 = new ArrayList<String>();
        myList1.add("Test");
        myList1.add("Shashank");
        myList1.add("Vivek");


        myList.addAll(myList1);

        for (String sList : myList) {
            System.out.println(sList);
        }

        for (Iterator iterator = myList.iterator(); iterator.hasNext(); ) {

            System.out.print(iterator.next());
        }
        myList.removeAll(Collections.singleton(null));
        Object [] arrays = myList.toArray();
        System.out.print(arrays);

        Set<String> s = new TreeSet<>();
        System.out.println("\n");
        for(String s1 : myList1){
            s.add(s1);
            System.out.println(s.size() + " distinct words: " + s);
            System.out.println("\n");
        }

        List<String> list3 = new ArrayList<String>(myList);
        list3.addAll(myList1);
    }


}
