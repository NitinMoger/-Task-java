package com.xworkz.Test;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicat {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Shambhu");
        list.add("Kiran");
        list.add("Nitin");
        list.add("Madhu");
        list.add("Shambhu");



list.remove("Shambhu");
        System.out.println(list);

    }
}
