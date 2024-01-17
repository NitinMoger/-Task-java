package com.programe.CollectionRunner;

import com.programe.collectionDTO.CardBoardDTO;
import com.programe.collectionDTO.JoystickDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JoystickRunner {
    public static void main(String[] args) {
        JoystickDTO JoystickDTO=new JoystickDTO("Black",100,1);
        JoystickDTO JoystickDTO1=new JoystickDTO("White",200,3);
        JoystickDTO JoystickDTO2=new JoystickDTO("Pink",1500,4);
        JoystickDTO JoystickDTO3=new JoystickDTO("Red",1000,10);
        JoystickDTO JoystickDTO4=new JoystickDTO("Gray",700,6);

        List<JoystickDTO> list=new ArrayList<>();
        list.add(JoystickDTO);
        list.add(JoystickDTO1);
        list.add(JoystickDTO2);
        list.add(JoystickDTO3);
        list.add(JoystickDTO4);

        System.out.println("Default Ascending order....");
        Collections.sort(list);
        for (JoystickDTO ref:list
        ) {
            System.out.println(ref);
        }

        System.out.println(" Descending order based on Warranty....");
        Collections.sort(list,(o1, o2) ->Integer.compare(o2.getWarranty(), o1.getWarranty()));
        for (JoystickDTO ref1:list) {
            System.out.println(ref1);
        }


    }
}
