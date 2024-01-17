package com.programe.CollectionRunner;

import com.programe.collectionDTO.ThreadDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadRunner {
    public static void main(String[] args) {
        ThreadDTO threadDTO=new ThreadDTO(15,"Metrics thread",102);
        ThreadDTO threadDTO1=new ThreadDTO(17,"Buttress  thread",60);
        ThreadDTO threadDTO2=new ThreadDTO(25,"Square thread",356);
        ThreadDTO threadDTO3=new ThreadDTO(45,"Straigth thread",789);
        ThreadDTO threadDTO4=new ThreadDTO(35,"NPT thread",200);

        List<ThreadDTO> list=new ArrayList<>();
        list.add(threadDTO);
        list.add(threadDTO1);
        list.add(threadDTO2);
        list.add(threadDTO3);
        list.add(threadDTO4);

        System.out.println("Default Ascending order based on cost..");
        Collections.sort(list);
        for (ThreadDTO r:list
        ) {
            System.out.println(r);
        }

        System.out.println("Descending order based on cost..");
        Collections.sort(list,(o1, o2) ->Double.compare(o2.getCost(),o1.getCost()));
        for (ThreadDTO r:list
        ) {
            System.out.println(r);
        }
    }
}