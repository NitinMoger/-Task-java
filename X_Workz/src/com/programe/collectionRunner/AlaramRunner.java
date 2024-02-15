package com.programe.collectionRunner;

import com.programe.collectionDTO.AlaramDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlaramRunner {
    public static void main(String[] args) {
        AlaramDTO alarmDTO = new AlaramDTO("System alarm", 1, 10000);
        AlaramDTO alarmDTO1 = new AlaramDTO("Burglar alarms", 4, 50000);
        AlaramDTO alarmDTO2 = new AlaramDTO("Bells", 3, 40000);
        AlaramDTO alarmDTO3 = new AlaramDTO("Water Alarm", 5, 70000);
        AlaramDTO alarmDTO4 = new AlaramDTO("Motion sensors", 2, 20000);

        List<AlaramDTO> list = new ArrayList<>();
        list.add(alarmDTO);
        list.add(alarmDTO1);
        list.add(alarmDTO2);
        list.add(alarmDTO3);
        list.add(alarmDTO4);

        Collections.sort(list);
        System.out.println("After Sorting in Asending order");
        for (AlaramDTO ref : list) {
            System.out.println(ref);
        }

        Collections.sort(list, (o1, o2) -> o2.getType().compareTo(o1.getType()));
        System.out.println("After Sorting in Descending order");
        for (AlaramDTO ref : list) {
            System.out.println(ref);
        }
    }
}


