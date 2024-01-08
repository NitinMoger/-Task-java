package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RadioStation {
    public static void main(String[] args) {
        Collection<String> languages=new ArrayList<>();
        languages.add("Kannada");
        languages.add("English");
        languages.add("Telugu");
        languages.add("Tamil");
        languages.add("Hindi");
        languages.add("Bengali");
        Iterator<String> ref= languages.iterator();
        while(ref.hasNext())
        {
           String val=ref.next();

           if(val.endsWith("i")) {

               System.out.println("The languages are end with i: " + val);

           }

        }

    }
}
