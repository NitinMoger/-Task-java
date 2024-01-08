package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hotel {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Udupi Hotel");
        collection.add("New Udupi");
        collection.add("Dum biryani");
        collection.add("Swadhist");
        collection.add("Rameswarm cafe");
        collection.add("Brandavana Spoo");
        collection.add("Bhojanalaya");
        collection.add("Bombat uta");
        collection.add("SaviRuchi");
        collection.add("Kai Ruchi");
        collection.add("Halli mane");
        collection.add("Amrutha");
        collection.add("Akash Hotel");
        collection.add("Sampath");
        collection.add("New cafe");
        collection.add("Mandya hotel");
        collection.add("Swagath");
        collection.add("Smabram Hotel");
        collection.add("Parijata hotel");
        collection.add("OriO");
        Iterator<String> search = collection.iterator();
        while (search.hasNext()) {
            String val = search.next();
            if(val.toLowerCase().endsWith("o"))
            {
                System.out.println("The Hotel NAme end with o:"+val);
            }
        }

    }
}
