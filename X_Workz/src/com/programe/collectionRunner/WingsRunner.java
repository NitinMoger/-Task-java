package com.programe.collectionRunner;



import com.programe.collectionDTO.WingsDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WingsRunner {
    public static void main(String[] args) {
        WingsDTO wingsDTO=new WingsDTO(45000.2,"Low wing",5);
        WingsDTO wingsDTO1=new WingsDTO(8000.0,"High wing",3);
        WingsDTO wingsDTO2=new WingsDTO(8028.7,"Swept wing",4);
        WingsDTO wingsDTO3=new WingsDTO(54679.0,"Delta wing",2);
        WingsDTO wingsDTO4=new WingsDTO(64599.9,"Rectangular wing",9);

        List<WingsDTO> list=new ArrayList<>();
        list.add(wingsDTO);
        list.add(wingsDTO1);
        list.add(wingsDTO2);
        list.add(wingsDTO3);
        list.add(wingsDTO4);

        System.out.println("Ascending order based on cost..");
        Collections.sort(list,((o1, o2) -> {return Double.compare(o1.getCost(),o2.getCost());}));
        for (WingsDTO w:list
        ) {
            System.out.println(w);
        }

        System.out.println("Descending order based on cost..");
        Collections.sort(list,(o1, o2) ->Double.compare(o2.getCost(),o1.getCost()));
        for (WingsDTO w:list
        ) {
            System.out.println(w);
        }

    }
}