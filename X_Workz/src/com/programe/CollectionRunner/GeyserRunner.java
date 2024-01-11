package com.programe.CollectionRunner;

import com.programe.collectionDTO.GeyserDTO;
import com.programe.collectionDTO.GeyserDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GeyserRunner {
    public static void main(String[] args) {
        GeyserDTO geyserDTO=new GeyserDTO(2,"Butterfly",3500,2);
        GeyserDTO geyserDTO1=new GeyserDTO(3,"Usha",2500,2);
        GeyserDTO geyserDTO2=new GeyserDTO(5,"Bajaj",4500,5);
        GeyserDTO geyserDTO3=new GeyserDTO(2,"Samsung",5000,4);
        GeyserDTO geyserDTO4=new GeyserDTO(5,"Philips",5500,3);

        List<GeyserDTO> list=new ArrayList<>();
        list.add(geyserDTO);
        list.add(geyserDTO1);
        list.add(geyserDTO2);
        list.add(geyserDTO3);
        list.add(geyserDTO4);

        Comparator<GeyserDTO> ref=(p1, p2)->
        {
            return Integer.compare(p1.getQuantity(), p2.getQuantity());
        };
        Comparator<GeyserDTO> ref1=(p1,p2)->
        {
            return Double.compare(p1.getCost(), p2.getCost());
        };
        Comparator<GeyserDTO> ref2=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p1.getBrand(), p2.getBrand());
        };
        Comparator<GeyserDTO> ref3=(p1,p2)->
        {
            return Integer.compare(p1.getWarranty(), p2.getWarranty());
        };
        Collections.sort(list,ref);
        System.out.println("Quantity in Ascending Order");
        for(GeyserDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref1);
        System.out.println("Cost in Ascending Order");
        for(GeyserDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref2);
        System.out.println("Brand of travel in Ascending Order");
        for(GeyserDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref3);
        System.out.println("Warranty in Ascending Order");
        for(GeyserDTO val:list)
        {
            System.out.println(val);
        }

        System.out.println("==========================");
        System.out.println("All properties in Descending Order");

        Comparator<GeyserDTO> ref4=(p1, p2)->
        {
            return Integer.compare(p2.getQuantity(), p1.getQuantity());
        };
        Comparator<GeyserDTO> ref5=(p1,p2)->
        {
            return Double.compare(p2.getCost(), p1.getCost());
        };
        Comparator<GeyserDTO> ref6=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getBrand(), p1.getBrand());
        };
        Comparator<GeyserDTO> ref7=(p1,p2)->
        {
            return Integer.compare(p2.getWarranty(), p1.getWarranty());
        };
        Collections.sort(list,ref4);
        System.out.println("Quantity in Descending Order");
        for(GeyserDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref5);
        System.out.println("Cost in descending Order");
        for(GeyserDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref6);
        System.out.println("Brand of travel in descending Order");
        for(GeyserDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref7);
        System.out.println("Warranty in descending Order");
        for(GeyserDTO val:list)
        {
            System.out.println(val);
        }

    }
}
