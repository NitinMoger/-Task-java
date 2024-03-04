package com.xworkz.Test;

import java.util.HashMap;
import java.util.Map;

public class SpecificKeyInHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(121,"Nitin");
        map.put(122,"Kiran");
        map.put(123,"Madhu");
        map.put(124,"Shambhu");
        map.put(125,"Anil");

        System.out.println(map.get(121));

    }
}
