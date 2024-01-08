package com.xworkz.listCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TreeList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(20);
        list.add(25);
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);
        list.add(30);
        list.add(50);
        list.add(12);
        list.add(18);
        Collections.sort(list);
        System.out.println("List in ascending order");
        for(int val:list){
            System.out.println(val);
        }

        Comparator<Integer> comparator=new TreeComparator();
        Collections.sort(list,comparator);
        System.out.println("The list in Descending Order");
        for(int val:list)
        {
            System.out.println(val);
        }
    }
}
