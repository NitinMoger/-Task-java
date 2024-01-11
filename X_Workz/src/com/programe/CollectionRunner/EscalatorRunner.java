package com.programe.CollectionRunner;

import com.programe.collectionDTO.EscalatorDTO;
import com.programe.collectionDTO.EscalatorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EscalatorRunner {
    public static void main(String[] args) {
        EscalatorDTO escalatorDTO=new EscalatorDTO(20,50,"Upward",20);
        EscalatorDTO escalatorDTO1=new EscalatorDTO(30,40,"Downward",30);
        EscalatorDTO escalatorDTO2=new EscalatorDTO(15,80,"Upward",20);
        EscalatorDTO escalatorDTO3=new EscalatorDTO(20,70,"Downward",25);
        EscalatorDTO escalatorDTO4=new EscalatorDTO(10,100,"Upward",17);

        List<EscalatorDTO> list=new ArrayList<>();
        list.add(escalatorDTO);
        list.add(escalatorDTO1);
        list.add(escalatorDTO2);
        list.add(escalatorDTO3);
        list.add(escalatorDTO4);

        Comparator<EscalatorDTO> ref=(p1, p2)->
        {
            return Integer.compare(p1.getSpeed(), p2.getSpeed());
        };
        Comparator<EscalatorDTO> ref1=(p1,p2)->
        {
            return Integer.compare(p1.getCapacity(), p2.getCapacity());
        };
        Comparator<EscalatorDTO> ref2=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p1.getDirectionOfTravel(), p2.getDirectionOfTravel());
        };
        Comparator<EscalatorDTO> ref3=(p1,p2)->
        {
            return Double.compare(p1.getStepWidth(), p2.getStepWidth());
        };
        Collections.sort(list,ref);
        System.out.println("Speed in Ascending Order");
        for(EscalatorDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref1);
        System.out.println("Capacity in Ascending Order");
        for(EscalatorDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref2);
        System.out.println("Direction of travel in Ascending Order");
        for(EscalatorDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref3);
        System.out.println("step width in Ascending Order");
        for(EscalatorDTO val:list)
        {
            System.out.println(val);
        }
        System.out.println("================================");
        System.out.println("Properties in Descending Order");
        Comparator<EscalatorDTO> ref4=(p1, p2)->
        {
            return Integer.compare(p2.getSpeed(), p1.getSpeed());
        };
        Comparator<EscalatorDTO> ref5=(p1,p2)->
        {
            return Integer.compare(p2.getCapacity(), p1.getCapacity());
        };
        Comparator<EscalatorDTO> ref6=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getDirectionOfTravel(), p1.getDirectionOfTravel());
        };
        Comparator<EscalatorDTO> ref7=(p1,p2)->
        {
            return Double.compare(p2.getStepWidth(), p1.getStepWidth());
        };
        Collections.sort(list,ref4);
        System.out.println("Speed in Descending Order");
        for(EscalatorDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref5);
        System.out.println("Capacity in descending Order");
        for(EscalatorDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref6);
        System.out.println("Direction of travel in descending Order");
        for(EscalatorDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref7);
        System.out.println("step width in descending Order");
        for(EscalatorDTO val:list)
        {
            System.out.println(val);
        }

    }
}
