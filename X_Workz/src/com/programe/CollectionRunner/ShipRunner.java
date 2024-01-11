package com.programe.CollectionRunner;

import com.programe.collectionDTO.ShipDTO;
import com.programe.collectionDTO.ShipDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShipRunner {
    public static void main(String[] args) {
        ShipDTO shipDTO=new ShipDTO("Container Ship","Life Jacket",105,100);
        ShipDTO shipDTO1=new ShipDTO("Fishing vessels","Life rafts",100,200);
        ShipDTO shipDTO2=new ShipDTO("oil Container","Lifeboats",250,150);
        ShipDTO shipDTO3=new ShipDTO("Cargo ship","Emergency lighting",500,100);
        ShipDTO shipDTO4=new ShipDTO("naval Ships","Life Jacket",110,500);

        List<ShipDTO> list=new ArrayList<>();
        list.add(shipDTO);
        list.add(shipDTO1);
        list.add(shipDTO2);
        list.add(shipDTO3);
        list.add(shipDTO4);

        Comparator<ShipDTO> ref=(p1, p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p1.getTypes(), p2.getTypes());
        };
        Comparator<ShipDTO> ref1=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p1.getSafetyFeatures(), p2.getSafetyFeatures());
        };
        Comparator<ShipDTO> ref2=(p1,p2)->
        {
            return Integer.compare(p1.getCargoCapacity(), p2.getCargoCapacity());
        };
        Comparator<ShipDTO> ref3=(p1,p2)->
        {
            return Integer.compare(p1.getPassengerCapacity(), p2.getPassengerCapacity());
        };
        Collections.sort(list,ref);
        System.out.println("Types in Ascending Order");
        for(ShipDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref1);
        System.out.println("Safty Features in Ascending Order");
        for(ShipDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref2);
        System.out.println("Cargo capacity in Ascending Order");
        for(ShipDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref3);
        System.out.println("Passaenger capacity in Ascending Order");
        for(ShipDTO val:list)
        {
            System.out.println(val);
        }

        System.out.println("======================");
        System.out.println("All properties in descending order");
        Comparator<ShipDTO> ref4=(p1, p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getTypes(), p1.getTypes());
        };
        Comparator<ShipDTO> ref5=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getSafetyFeatures(), p1.getSafetyFeatures());
        };
        Comparator<ShipDTO> ref6=(p1,p2)->
        {
            return Integer.compare(p2.getCargoCapacity(), p1.getCargoCapacity());
        };
        Comparator<ShipDTO> ref7=(p1,p2)->
        {
            return Integer.compare(p2.getPassengerCapacity(), p1.getPassengerCapacity());
        };
        Collections.sort(list,ref4);
        System.out.println("Types in descending Order");
        for(ShipDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref5);
        System.out.println("Safty Features in descending Order");
        for(ShipDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref6);
        System.out.println("Cargo capacity in descending Order");
        for(ShipDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref7);
        System.out.println("Passaenger capacity in descending Order");
        for(ShipDTO val:list)
        {
            System.out.println(val);
        }
    }
}
