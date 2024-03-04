package com.xworkz.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class IntersectionFinder {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(13);
        list.add(12);
        list.add(15);
        list.add(15);

        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(22);
        list1.add(34);
        list1.add(23);
        list1.add(13);


        System.out.println(list.retainAll(list1));
        System.out.println(list);


    }
}
