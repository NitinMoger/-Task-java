package com.programe.CollectionRunner;

import com.programe.CollectionComparator.*;
import com.programe.collectionDTO.SpeakerDTO;
import com.programe.collectionDTO.WaterPurifierDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaterPurifierDTORunner {
    public static void main(String[] args) {

        WaterPurifierDTO waterPurifierDTO = new WaterPurifierDTO("Reverse Osmosis", 5, "Boat", 2000.0);
        WaterPurifierDTO waterPurifierDTO1 = new WaterPurifierDTO("Activated carbon", 10, "Zibronics",2500.0);
        WaterPurifierDTO waterPurifierDTO2 = new WaterPurifierDTO("Water Purifiers", 30, "Philips", 3000.0);
        WaterPurifierDTO waterPurifierDTO3 = new WaterPurifierDTO("Ultrviolet", 25, "Noise", 5000.0);
        WaterPurifierDTO waterPurifierDTO4 = new WaterPurifierDTO("Candle filters", 10, "Sony", 1500.0);

        List<WaterPurifierDTO> list = new ArrayList<>();
        list.add(waterPurifierDTO);
        list.add(waterPurifierDTO1);
        list.add(waterPurifierDTO2);
        list.add(waterPurifierDTO3);
        list.add(waterPurifierDTO4);

        System.out.println("Ascending order based on quantity..");
        Comparator<WaterPurifierDTO> comparator = new WaterPurifierDTOComparatorQuantity();
        Collections.sort(list, comparator);
        for (WaterPurifierDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Ascending order based on Cost..");
        Comparator<WaterPurifierDTO> comparator1 = new WaterPurifierDTOComparatorCost();
        Collections.sort(list, comparator1);
        for (WaterPurifierDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("========================================================================");
        System.out.println("Ascending order based on Brand..");
        Comparator<WaterPurifierDTO> comparator2 = new WaterPurifierDTOComparatorBrand();
        Collections.sort(list, comparator2);
        for (WaterPurifierDTO brand : list
        ) {
            System.out.println(brand);
        }
        System.out.println("======================================================================== ");
        System.out.println("Ascending order based on Type..");
        Comparator<WaterPurifierDTO> comparator3 = new WaterPurifierDTOComparatorType();
        Collections.sort(list, comparator3);
        for (WaterPurifierDTO warranty : list
        ) {
            System.out.println(warranty);
        }
        System.out.println("======================================================================== ");
        System.out.println("All are in descending order...");
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on quantity..");
        Comparator<WaterPurifierDTO> comparator4 = new WaterPurifierDTOComparatorQuantityDesc();
        Collections.sort(list, comparator4);
        for (WaterPurifierDTO quantity : list
        ) {
            System.out.println(quantity);
        }
        System.out.println("=========================================================================");
        System.out.println("Descending order based on Cost..");
        Comparator<WaterPurifierDTO> comparator5 = new WaterPurifierDTOComparatorCostDesc();
        Collections.sort(list, comparator5);
        for (WaterPurifierDTO cost : list
        ) {
            System.out.println(cost);
        }
        System.out.println("========================================================================");
        System.out.println("Descending order based on Brand..");
        Comparator<WaterPurifierDTO> comparator6 = new WaterPurifierDTOComparatorBrandDesc();
        Collections.sort(list, comparator6);
        for (WaterPurifierDTO brand : list
        ) {
            System.out.println(brand);
        }
        System.out.println("======================================================================== ");
        System.out.println("Descending order based on Type..");
        Comparator<WaterPurifierDTO> comparator7 = new WaterPurifierDTOComparatorTypeDesc();
        Collections.sort(list, comparator7);
        for (WaterPurifierDTO warranty : list
        ) {
            System.out.println(warranty);
        }


    }


}
