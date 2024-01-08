package com.xworkz.listCollection;

import java.util.Comparator;

public class VegetablesComparator implements Comparator<Double> {
    @Override
    public int compare(Double o1, Double o2) {
        int ref=o2.compareTo(o1);
        return ref;
    }
}
