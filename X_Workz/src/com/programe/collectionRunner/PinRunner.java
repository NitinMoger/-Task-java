package com.programe.collectionRunner;



import com.programe.collectionDTO.PinDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PinRunner {
    public static void main(String[] args) {
        PinDTO pinDTO = new PinDTO("Hair pin", 10, "Stich");
        PinDTO pinDTO1 = new PinDTO("Spring pin", 11, "cutting");
        PinDTO pinDTO2 = new PinDTO("Cotter pin", 20, "Crafts");
        PinDTO pinDTO3 = new PinDTO("Hitch pin", 13, "Diaper Pins");
        PinDTO pinDTO4 = new PinDTO("Dowels pin", 15, "Stiching");

        List<PinDTO> list = new ArrayList<>();
        list.add(pinDTO);
        list.add(pinDTO1);
        list.add(pinDTO2);
        list.add(pinDTO3);
        list.add(pinDTO4);

        System.out.println("Default Ascending order based on cost");
        Collections.sort(list);
        for (PinDTO s : list
        ) {
            System.out.println(s);
        }

        System.out.println("Descending order based on Cost");
        Collections.sort(list,(o1, o2) ->Double.compare(o2.getCost(), o1.getCost()));
        for (PinDTO s : list) {
            System.out.println(s);
        }

    }

}