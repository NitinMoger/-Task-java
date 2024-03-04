package com.xworkz.Test;

import java.util.HashSet;
import java.util.Set;

public class RemoveElement {
    public static void main(String[] args) {

        Set<String> set=new HashSet<>();
        set.add("Shambhu");
        set.add("Kiran");
        set.add("Nitin");
        set.add("Madhu");
        set.add("Anil");

        set.remove("Kiran");
        set.forEach(s-> System.out.println(s));
    }
}
