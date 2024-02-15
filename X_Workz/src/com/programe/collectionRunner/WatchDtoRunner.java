package com.programe.collectionRunner;

import com.programe.collectionDTO.WatchDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WatchDtoRunner {

    public static void main(String[] args) {
        WatchDTO watchDTO = new WatchDTO("Fastrack", 3, 3500, "Leather");
        WatchDTO watchDTO1 = new WatchDTO("Casio", 1, 5500, "Carbon");
        WatchDTO watchDTO2 = new WatchDTO("Sonata", 5, 4000, "Titanium");
        WatchDTO watchDTO3 = new WatchDTO("Fastrack", 3, 23000, "Gold");
        WatchDTO watchDTO4 = new WatchDTO("Bolt", 2, 5000, "Leather");

        List<WatchDTO> list = new ArrayList<>();
        list.add(watchDTO2);
        list.add(watchDTO1);
        list.add(watchDTO);
        list.add(watchDTO3);
        list.add(watchDTO4);


        Collections.sort(list);
        System.out.println("After Sorting in Asending order");
       for (WatchDTO val:list){
           System.out.println(val);
       }
//        System.out.println("Ascending order Depends On Warranty");
//        Collections.sort(list, (p1, p2) -> Integer.compare(p1.getWarranty(), p2.getWarranty()));
//        list.forEach(p -> System.out.println(p));

        System.out.println("Ascending order Depends On Brand");
        Collections.sort(list,(p1,p2)->String.CASE_INSENSITIVE_ORDER.compare(p1.getBrand(),p2.getBrand()));
        list.forEach(p-> System.out.println(p));

        System.out.println("Ascending order Depends On Price");
        Collections.sort(list, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        list.forEach(p -> System.out.println(p));

        System.out.println("Ascending order Depends On Material");
        Collections.sort(list,(p1,p2)->String.CASE_INSENSITIVE_ORDER.compare(p1.getMaterial(),p2.getMaterial()));
        list.forEach(p-> System.out.println(p));

    }
}