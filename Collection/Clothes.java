package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Clothes {
    public static void main(String[] args) {
        Collection<Integer> cost=new ArrayList<>();
        cost.add(200);
        cost.add(250);
        cost.add(300);
        cost.add(350);
        cost.add(220);
        cost.add(3000);
        cost.add(450);
        Iterator<Integer> search= cost.iterator();
        while(search.hasNext()){
           // Integer ref= search.next();
            System.out.println("Price of clothes is:"+search.next());
        }
    }
}
