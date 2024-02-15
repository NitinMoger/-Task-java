package com.programe.collectionRunner;


import com.programe.collectionDTO.FireCrackerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FireCrackerRunner {
    public static void main(String[] args) {
        FireCrackerDTO fireCrackerDTO=new FireCrackerDTO(45,"Petrol","Brown");
        FireCrackerDTO fireCrackerDTO1=new FireCrackerDTO(46,"Carosin","Blue");
        FireCrackerDTO fireCrackerDTO2=new FireCrackerDTO(44,"Diesel","Purple");
        FireCrackerDTO fireCrackerDTO3=new FireCrackerDTO(47,"Petrol1 A","Dark brown");
        FireCrackerDTO fireCrackerDTO4=new FireCrackerDTO(41,"Oil","Black");

        List<FireCrackerDTO> list=new ArrayList<>();
        list.add(fireCrackerDTO);
        list.add(fireCrackerDTO1);
        list.add(fireCrackerDTO2);
        list.add(fireCrackerDTO3);
        list.add(fireCrackerDTO4);

        System.out.println("Default Ascending order ..");
        Collections.sort(list);
        for (FireCrackerDTO f:list
        ) {
            System.out.println(f);
        }

        Collections.sort(list, (o1, o2) -> o2.getColor().compareTo(o1.getColor()));
        System.out.println("After Sorting in Descending order");
        for (FireCrackerDTO ref : list) {
            System.out.println(ref);
        }
    }
}
