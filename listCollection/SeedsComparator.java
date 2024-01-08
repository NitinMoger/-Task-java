package com.xworkz.listCollection;

import java.util.Comparator;

public class SeedsComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int rslt=o2.compareTo(o1);
        return rslt;
    }
}
