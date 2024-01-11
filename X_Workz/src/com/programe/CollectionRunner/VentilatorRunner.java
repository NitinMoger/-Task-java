package com.programe.CollectionRunner;

import com.programe.collectionDTO.VentilatorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VentilatorRunner {
    public static void main(String[] args) {

        VentilatorDTO ventilatorDTO=new VentilatorDTO(250.0,"Medtronic",23.5,"Volume-Controlled Ventilators (VCV)");
        VentilatorDTO ventilatorDTO1=new VentilatorDTO(300.0,"Philips",13.5,"Pressure-Controlled Ventilators (PCV)");
        VentilatorDTO ventilatorDTO2=new VentilatorDTO(350.0,"Dragor",23.5,"Pressure Support Ventilation (PSV)");
        VentilatorDTO ventilatorDTO3=new VentilatorDTO(450.0,"GE Healthcare",33.5,"High-Frequency Oscillatory Ventilation (HFOV)");
        VentilatorDTO ventilatorDTO4=new VentilatorDTO(550.0,"Mindray",10.5,"Transport Ventilators");

        List<VentilatorDTO> list=new ArrayList<>();
        list.add(ventilatorDTO);
        list.add(ventilatorDTO1);
        list.add(ventilatorDTO2);
        list.add(ventilatorDTO3);
        list.add(ventilatorDTO4);


        Comparator<VentilatorDTO> ref=(p1, p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p1.getName(), p2.getName());
        };
        Comparator<VentilatorDTO> ref1=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p1.getTypes(), p2.getTypes());
        };
        Comparator<VentilatorDTO> ref2=(p1,p2)->
        {
            return Double.compare(p1.getCost(), p2.getCost());
        };
        Comparator<VentilatorDTO> ref3=(p1,p2)->
        {
            return Double.compare(p1.getSize(), p2.getSize());
        };
        Collections.sort(list,ref);
        System.out.println("Name in Ascending Order");
        for(VentilatorDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref1);
        System.out.println("Types in Ascending Order");
        for(VentilatorDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref2);
        System.out.println("cost in Ascending Order");
        for(VentilatorDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref3);
        System.out.println("Size in Ascending Order");
        for(VentilatorDTO val:list)
        {
            System.out.println(val);
        }

        System.out.println("========================");
        System.out.println("All properties in Descending order");
        Comparator<VentilatorDTO> ref4=(p1, p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getName(), p1.getName());
        };
        Comparator<VentilatorDTO> ref5=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getTypes(), p1.getTypes());
        };
        Comparator<VentilatorDTO> ref6=(p1,p2)->
        {
            return Double.compare(p2.getCost(), p1.getCost());
        };
        Comparator<VentilatorDTO> ref7=(p1,p2)->
        {
            return Double.compare(p2.getSize(), p1.getSize());
        };
        Collections.sort(list,ref4);
        System.out.println("Name in descending Order");
        for(VentilatorDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref5);
        System.out.println("Types in descending Order");
        for(VentilatorDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref6);
        System.out.println("cost in descending Order");
        for(VentilatorDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref7);
        System.out.println("Size in descending Order");
        for(VentilatorDTO val:list)
        {
            System.out.println(val);
        }
    }
}
