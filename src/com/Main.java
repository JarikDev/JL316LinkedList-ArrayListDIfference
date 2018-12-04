package com;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        LinkedList linkedList=new LinkedList<>();
            arrayList.add("one");
        arrayList.add("three");
        arrayList.add("two");
        arrayList.add("three");
        for (String s   :arrayList) {
            System.out.println(s);

        }



    }
}
