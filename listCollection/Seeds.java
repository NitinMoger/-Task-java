package com.xworkz.listCollection;

import javafx.collections.FXCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Seeds {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple Seeds");
        list.add("Orange seeds");
        list.add("Tomato seeds");
        list.add("Strawberry seeds");
        list.add("Watermelon seeds");
        list.add("Cucumber seeds");
        list.add("Bell seeds");
        list.add("Pumpkin seeds");
        list.add("Orange seeds");
        list.add("Avocado seeds");
        Comparator<String> comparator = new SeedsComparator();

        Collections.sort(list);

        System.out.println("list after sorting in ascending order:");
        for (String element:list)
        {
            System.out.println(element);

        }
        System.out.println("====================");
        System.out.println("list after sorting in descending order:");
        System.out.println("====================");
        Collections.sort(list,comparator);
        for (String element:list)
        {
            System.out.println(element);

        }


    }
}
