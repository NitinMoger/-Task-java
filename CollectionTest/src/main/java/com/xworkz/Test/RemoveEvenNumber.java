package com.xworkz.Test;

import sun.text.resources.BreakIteratorInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenNumber {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(21);
        list.add(10);
        list.add(22);
        list.add(23);
        list.add(26);

        Iterator<Integer> ref= list.listIterator();
        while(ref.hasNext()){
            int ref1= ref.next();
            if(ref1%2==0){
                ref.remove();
            }
        }
        System.out.println(list);
    }
}
