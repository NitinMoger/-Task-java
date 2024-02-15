package com.programe.collectionRunner;

import com.programe.collectionComparator.*;
import com.programe.collectionDTO.BeltDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeltRunner {
    public static void main(String[] args) {
        BeltDTO beltDTO=new BeltDTO(250,"Tommy Hilfiger",20,"Chain belts");
        BeltDTO beltDTO1=new BeltDTO(300,"Allen solly",10,"Leather Belt");
        BeltDTO beltDTO2=new BeltDTO(250,"Van Heusen",40,"V-belt");
        BeltDTO beltDTO3=new BeltDTO(200,"Lee cooper",10,"Round Belt");
        BeltDTO beltDTO4=new BeltDTO(400,"Wrangler",30,"Conveyor belt");

        List<BeltDTO> list=new ArrayList<>();
        list.add(beltDTO);
        list.add(beltDTO1);
        list.add(beltDTO2);
        list.add(beltDTO3);
        list.add(beltDTO4);

        Comparator<BeltDTO> comparator=new BeltTypeComparator();

        Collections.sort(list,comparator);
        System.out.println("Belt type in Ascending Order");
        for(BeltDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<BeltDTO> comparator1=new BeltCostComparator();

        Collections.sort(list,comparator1);
        System.out.println("Belt cost in Ascending Order");
        for(BeltDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<BeltDTO> comparator2=new BeltBrandComparator();

        Collections.sort(list,comparator2);
        System.out.println("Belt Brand in Ascending Order");
        for(BeltDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<BeltDTO> comparator3=new BeltQuantityComparator();

        Collections.sort(list,comparator3);
        System.out.println("Belt quantity in Ascending Order");
        for(BeltDTO ref:list)
        {
            System.out.println(ref);
        }

        System.out.println("=========================================");
        System.out.println("The Belt Properties In Descending Order");
        System.out.println("==========================================");

        Comparator<BeltDTO> comparator4=new BeltCostComparatorDesc();

        Collections.sort(list,comparator4);
        System.out.println("belt Cost in Descending Order");
        for(BeltDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<BeltDTO> comparator5=new BeltQuantityComparatorDesc();

        Collections.sort(list,comparator5);
        System.out.println("Belt quantity in Descending Order");
        for(BeltDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<BeltDTO> comparator6=new BeltBrandComparatorDesc();

        Collections.sort(list,comparator6);
        System.out.println("Belt Brand in Descending Order");
        for(BeltDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<BeltDTO> comparator7=new BeltTypeComparatorDesc();

        Collections.sort(list,comparator7);
        System.out.println("Belt type in Descending Order");
        for(BeltDTO ref:list)
        {
            System.out.println(ref);
        }

    }
}
