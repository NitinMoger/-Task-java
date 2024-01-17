package com.programe.CollectionRunner;

import com.programe.collectionDTO.FireCrackerDTO;
import com.programe.collectionDTO.RopeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RopeRunner {
    public static void main(String[] args) {
        RopeDTO ropeDTO=new RopeDTO(50,"Cotton rope",150,"Red");
        RopeDTO ropeDTO1=new RopeDTO(40,"Nylon rope",350,"Blue");
        RopeDTO ropeDTO2=new RopeDTO(60,"Polystere rope",850,"Green");
        RopeDTO ropeDTO3=new RopeDTO(80,"Manila rope",450,"Black");
        RopeDTO ropeDTO4=new RopeDTO(70,"Jute rope",250,"Yellow");

        List<RopeDTO> list=new ArrayList<>();
        list.add(ropeDTO);
        list.add(ropeDTO1);
        list.add(ropeDTO2);
        list.add(ropeDTO3);
        list.add(ropeDTO4);

        Collections.sort(list);
        System.out.println("Ascending order");
        for(RopeDTO ref:list) {
            System.out.println(ref);
        }

        Collections.sort(list, (o1, o2) -> o2.getColor().compareTo(o1.getColor()));
        System.out.println("After Sorting in Descending order");
        for (RopeDTO ref : list) {
            System.out.println(ref);
        }
    }
}