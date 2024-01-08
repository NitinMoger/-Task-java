package com.xworkz.listCollection;

import java.util.Comparator;

public class TreeComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        int ref=o2.compareTo(o1);
        return ref;
    }
}
