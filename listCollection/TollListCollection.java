package com.xworkz.listCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class TollListCollection {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<Double>();
        list.add(12.3);
        list.add(13.4);
        list.add(10.6);
        list.add(12.3);
        list.add(1.0);
        list.add(133.1);
        list.add(21.4);
        list.add(33.3);
        list.add(53.2);
        list.add(03.3);

        Collections.sort(list);
        System.out.println("List sorted in Ascending order");
        for (double val:list)
        {
            System.out.println(val);
        }
        Comparator<Double> comparator=new TollComparator();

        Collections.sort(list,comparator);
        System.out.println("list Sorted in descending order:");
        for(double val:list)
        {
            System.out.println(val);
        }


    }

}
