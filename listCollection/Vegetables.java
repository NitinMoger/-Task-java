package com.xworkz.listCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Vegetables {
    public static void main(String[] args) {
        List<Double> list=new ArrayList<Double>();
        list.add(20.0);
        list.add(25.5);
        list.add(26.0);
        list.add(50.4);
        list.add(25.0);
        list.add(100.0);
        list.add(60.0);
        list.add(70.8);
        list.add(10.0);
        list.add(5.10);

        Collections.sort(list);
        System.out.println("The list in Ascending order");
        for(double price:list)
        {
            System.out.println(price);
        }
        Comparator<Double> comparator=new VegetablesComparator();
        Collections.sort(list,comparator);
        System.out.println("The List in Descending order");
        for(double price:list)
        {
            System.out.println(price);
        }

    }
}
