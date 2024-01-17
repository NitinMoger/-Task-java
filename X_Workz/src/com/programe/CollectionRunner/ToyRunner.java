package com.programe.CollectionRunner;

import com.programe.collectionDTO.ToyDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToyRunner {
    public static void main(String[] args) {
        ToyDTO toyDTO=new ToyDTO("Remote car",350,1);
        ToyDTO toyDTO1=new ToyDTO("Kids toy",250,3);
        ToyDTO toyDTO2=new ToyDTO("Education toy",150,9);
        ToyDTO toyDTO3=new ToyDTO("Doll",750,8);
        ToyDTO toyDTO4=new ToyDTO("Building toy",650,6);

        List<ToyDTO> list=new ArrayList<>();
        list.add(toyDTO);
        list.add(toyDTO1);
        list.add(toyDTO2);
        list.add(toyDTO3);
        list.add(toyDTO4);

        System.out.println("Default Ascending order based on cost..");
        Collections.sort(list);
        for (ToyDTO t:list) {
            System.out.println(t);
        }

        System.out.println("Descending order based on cost..");
        Collections.sort(list,(o1, o2) ->Double.compare(o2.getCost(),o1.getCost()));
        for (ToyDTO t:list) {
            System.out.println(t);
        }

    }
}
