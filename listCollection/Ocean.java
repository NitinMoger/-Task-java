package com.xworkz.listCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ocean {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Pacific Ocean");
        list.add("Indian Ocean");
        list.add("Southern Ocean");
        list.add("Arctic Ocean");
        list.add("Antartic Ocean");
        list.add("Coral Ocean");
        list.add("South Ocean");
        list.add("Sargasso Ocean");
        list.add("Philippine Ocean");

        Collections.sort(list);
        System.out.println("The list In Ascending order");
        for (String name:list)
        {
            System.out.println(name);
        }

        Comparator<String> comparator=new OceanComparator();
        Collections.sort(list,comparator);
        System.out.println();
        System.out.println("The list in Descending Order");
        for(String name:list)
        {
            System.out.println(name);
        }
    }
}
