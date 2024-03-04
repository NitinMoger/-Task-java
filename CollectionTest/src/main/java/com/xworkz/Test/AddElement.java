package com.xworkz.Test;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Shambhu");
        list.add("Kiran");
        list.add("Nitin");
        list.add("Madhu");
        list.add("Anil");

        System.out.println(list);

        System.out.println("After Adding ");
        list.add("Madan");

        for (String str:list
             ) {
            System.out.println(str);
        }
    }
}
