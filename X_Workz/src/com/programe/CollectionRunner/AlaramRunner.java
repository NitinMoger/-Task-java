package com.programe.CollectionRunner;

import com.programe.collectionDTO.AlaramDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlaramRunner {
    public static void main(String[] args) {
        AlaramDTO alarmDTO=new AlaramDTO("System alarm",1,10000);
        AlaramDTO alarmDTO1=new AlaramDTO("Burglar alarms",4,50000);
        AlaramDTO alarmDTO2=new AlaramDTO("Bells",3,40000);
        AlaramDTO alarmDTO3=new AlaramDTO("Water Alarm",5,70000);
        AlaramDTO alarmDTO4=new AlaramDTO("Motion sensors",2,20000);

        List<AlaramDTO> list=new ArrayList<>();
        list.add(alarmDTO);
        list.add(alarmDTO1);
        list.add(alarmDTO2);
        list.add(alarmDTO3);
        list.add(alarmDTO4);

        System.out.println("Default Ascending order based on Quantity..");
        Collections.sort(list);
        for (AlaramDTO a:list) {
            System.out.println(a);
        }

        System.out.println("Ascending order based on Cost.....");
        Collections.sort(list,(a1,a2)->{
            return Double.compare(a1.getCost(),a2.getCost());
        });
        for (AlaramDTO a:list) {
            System.out.println(a);
        }

        System.out.println("Ascending order based on Type.....");
        Collections.sort(list,(a1,a2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(a1.getType(), a2.getType());
        });
        for (AlaramDTO a:list) {
            System.out.println(a);
        }

        System.out.println("Descending order based on Quantity.....");
        Collections.sort(list,(a1,a2)->{
            return Double.compare(a2.getQuantity(),a1.getQuantity());
        });
        for (AlaramDTO a:list) {
            System.out.println(a);
        }

        System.out.println("Descending order based on Cost.....");
        Collections.sort(list,(a1,a2)->{
            return Double.compare(a2.getCost(),a1.getCost());
        });
        for (AlaramDTO a:list) {
            System.out.println(a);
        }

        System.out.println("Descending order based on Type.....");
        Collections.sort(list,(a1,a2)->{
            return String.CASE_INSENSITIVE_ORDER.compare(a2.getType(), a1.getType());
        });
        for (AlaramDTO a:list) {
            System.out.println(a);
        }

    }
}

