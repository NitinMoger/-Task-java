package com.xworkz.listCollection;

import java.util.Comparator;

public class OceanComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int ref=o2.compareTo(o1);
        return ref;
    }
}
