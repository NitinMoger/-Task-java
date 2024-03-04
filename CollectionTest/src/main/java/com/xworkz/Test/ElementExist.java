package com.xworkz.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ElementExist {
    public static void main(String[] args) {
     boolean flag=false;

        Set<String> set=new HashSet<>();
        set.add("Shambhu");
        set.add("Kiran");
        set.add("Nitin");
        set.add("Madhu");
        set.add("Anil");

        Iterator<String> ref= set.iterator();
        while (ref.hasNext()) {
            String name = ref.next();

            if ("Kiran" == name) {
                flag = true;
            }
        }
            if(flag){
                System.out.println("Element is present");
            }else
            {
                System.out.println("Element is not present");
            }
        }

}
