package com.programe.CollectionRunner;

import com.programe.CollectionComparator.*;
import com.programe.collectionDTO.PaperDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaperRunner  {

    public static void main(String[] args) {
        PaperDTO paperDTO=new PaperDTO("Photo Paper",12.5,20,25);
        PaperDTO paperDTO1=new PaperDTO("Bond Paper",15.5,10,10);
        PaperDTO paperDTO2=new PaperDTO("Inkjet Paper",10.5,40,15);
        PaperDTO paperDTO3=new PaperDTO("kraft Paper",11.0,10,35);
        PaperDTO paperDTO4=new PaperDTO("Tissue Paper",15.0,30,15);

        List<PaperDTO> list=new ArrayList<>();
        list.add(paperDTO1);
        list.add(paperDTO);
        list.add(paperDTO2);
        list.add(paperDTO3);
        list.add(paperDTO4);

         Comparator<PaperDTO> comparator=new PaperTypeComparator();

        Collections.sort(list,comparator);
        System.out.println("Paper Type in Ascending Order");
        for(PaperDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<PaperDTO> comparator1=new PaperCostComparator();

        Collections.sort(list,comparator1);
        System.out.println("Paper cost in Ascending Order");
        for(PaperDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<PaperDTO> comparator2=new PaperWeightComparator();

        Collections.sort(list,comparator2);
        System.out.println("Paper weight in Ascending Order");
        for(PaperDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<PaperDTO> comparator3=new PaperQuantityComparator();

        Collections.sort(list,comparator3);
        System.out.println("Paper quantity in Ascending Order");
        for(PaperDTO ref:list)
        {
            System.out.println(ref);
        }

        System.out.println("=========================================");
        System.out.println("The Paper Properties In Descending Order");
        System.out.println("==========================================");

        Comparator<PaperDTO> comparator4=new PaperCostComparatorDesc();

        Collections.sort(list,comparator4);
        System.out.println("Paper Cost in Descending Order");
        for(PaperDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<PaperDTO> comparator5=new PaperQuantityComparatorDesc();

        Collections.sort(list,comparator5);
        System.out.println("Paper quantity in Descending Order");
        for(PaperDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<PaperDTO> comparator6=new PaperWeightComparatorDesc();

        Collections.sort(list,comparator6);
        System.out.println("Paper weight in Descending Order");
        for(PaperDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<PaperDTO> comparator7=new PaperTypeComparatorDesc();

        Collections.sort(list,comparator7);
        System.out.println("Paper type in Descending Order");
        for(PaperDTO ref:list)
        {
            System.out.println(ref);
        }
    }
}
