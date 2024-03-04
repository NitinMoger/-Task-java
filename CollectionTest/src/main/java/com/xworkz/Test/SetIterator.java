package com.xworkz.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Shambhu");
        set.add("Kiran");
        set.add("Nitin");
        set.add("Madhu");
        set.add("Anil");

        Iterator<String> ref= set.iterator();
        while (ref.hasNext()){
            System.out.println( ref.next());
        }
    }
}
