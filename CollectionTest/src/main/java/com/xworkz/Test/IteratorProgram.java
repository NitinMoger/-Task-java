package com.xworkz.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorProgram {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("India");
        list.add("USA");
        list.add("London");
        list.add("Korea");

        Iterator<String> iterator = list.iterator();
        System.out.println("Forward Iteration");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
