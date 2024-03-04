package com.xworkz.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorter {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("grape");


        Collections.sort(stringList);

        System.out.println("Sorted list:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }

}
