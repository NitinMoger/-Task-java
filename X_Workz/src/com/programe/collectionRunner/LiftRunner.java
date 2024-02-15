package com.programe.collectionRunner;

import com.programe.collectionDTO.LiftDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LiftRunner {
    public static void main(String[] args) {
        LiftDTO liftDTO=new LiftDTO(50,17,18.5);
        LiftDTO liftDTO1=new LiftDTO(60,10,13.0);
        LiftDTO liftDTO2=new LiftDTO(30,15,15.5);
        LiftDTO liftDTO3=new LiftDTO(50,20,20.2);
        LiftDTO liftDTO4=new LiftDTO(40,15,19.3);

        List<LiftDTO> list=new ArrayList<>();
        list.add(liftDTO);
        list.add(liftDTO1);
        list.add(liftDTO2);
        list.add(liftDTO3);
        list.add(liftDTO4);

        Comparator<LiftDTO> ref=(p1, p2)->
        {
            return Integer.compare(p1.getCapacity(), p2.getCapacity());
        };
        Comparator<LiftDTO> ref1=(p1,p2)->
        {
            return Double.compare(p1.getSpeed(), p2.getSpeed());
        };
        Comparator<LiftDTO> ref2=(p1,p2)->
        {
            return Integer.compare(p1.getTotalFloor(), p2.getTotalFloor());
        };
        Collections.sort(list,ref);
        System.out.println("Capacity in Ascending Order");
        for(LiftDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref1);
        System.out.println("Speed in Ascending Order");
        for(LiftDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref2);
        System.out.println("Total floor of travel in Ascending Order");
        for(LiftDTO val:list)
        {
            System.out.println(val);
        }

        System.out.println("===============================");
        System.out.println("All properties in Descending order");
        Comparator<LiftDTO> ref3=(p1, p2)->
        {
            return Integer.compare(p2.getCapacity(), p1.getCapacity());
        };
        Comparator<LiftDTO> ref4=(p1,p2)->
        {
            return Double.compare(p2.getSpeed(), p1.getSpeed());
        };
        Comparator<LiftDTO> ref5=(p1,p2)->
        {
            return Integer.compare(p2.getTotalFloor(), p1.getTotalFloor());
        };
        Collections.sort(list,ref3);
        System.out.println("Capacity in descending Order");
        for(LiftDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref4);
        System.out.println("Speed in descending Order");
        for(LiftDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref5);
        System.out.println("Total floor of travel in descending Order");
        for(LiftDTO val:list)
        {
            System.out.println(val);
        }
    }
}
