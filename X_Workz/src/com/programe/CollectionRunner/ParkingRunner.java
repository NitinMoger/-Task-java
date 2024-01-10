package com.programe.CollectionRunner;

import com.programe.CollectionComparator.*;
import com.programe.collectionDTO.PaperDTO;
import com.programe.collectionDTO.ParkingDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParkingRunner {
    public static void main(String[] args) {
        ParkingDTO parkingDTO=new ParkingDTO("Four Wheeler",30,50,"Easy Park");
        ParkingDTO parkingDTO1=new ParkingDTO("Two Wheeler",50,60,"Prime Park");
        ParkingDTO parkingDTO2=new ParkingDTO("Three Wheeler",25,50,"city Park");
        ParkingDTO parkingDTO3=new ParkingDTO("seven Wheeler",20,40,"Park Express");
        ParkingDTO parkingDTO4=new ParkingDTO("nine Wheeler",10,30,"Park Solution");
        List<ParkingDTO> list=new ArrayList<>();
        list.add(parkingDTO);
        list.add(parkingDTO1);
        list.add(parkingDTO2);
        list.add(parkingDTO3);
        list.add(parkingDTO4);

        Comparator<ParkingDTO> comparator=new ParkingComparatorVehicleType();

        Collections.sort(list,comparator);
        System.out.println("Parking vehicle Type in Ascending Order");
        for(ParkingDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<ParkingDTO> comparator1=new ParkingComparatortotalNumVehicle();

        Collections.sort(list,comparator1);
        System.out.println("Parking Totalnumber Vehicle in Ascending Order");
        for(ParkingDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<ParkingDTO> comparator2=new ParkingComparatorParkingSize();

        Collections.sort(list,comparator2);
        System.out.println("Parking size in Ascending Order");
        for(ParkingDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<ParkingDTO> comparator3=new ParkingComparatorName();

        Collections.sort(list,comparator3);
        System.out.println("Parking name in Ascending Order");
        for(ParkingDTO ref:list)
        {
            System.out.println(ref);
        }

        System.out.println("=========================================");
        System.out.println("The Paper Properties In Descending Order");
        System.out.println("==========================================");

        Comparator<ParkingDTO> comparator4=new ParkingComparatorVehicleTypeDesc();

        Collections.sort(list,comparator4);
        System.out.println("Parking type in Descending Order");
        for(ParkingDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<ParkingDTO> comparator5=new ParkingComparatortotalNumVehicleDesc();

        Collections.sort(list,comparator5);
        System.out.println("Parking Totalnumber Vehicle  in Descending Order");
        for(ParkingDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<ParkingDTO> comparator6=new ParkingComparatorparkingSizeDesc();

        Collections.sort(list,comparator6);
        System.out.println("Parking size in Descending Order");
        for(ParkingDTO ref:list)
        {
            System.out.println(ref);
        }

        Comparator<ParkingDTO> comparator7=new ParkingComparatorNameDesc();

        Collections.sort(list,comparator7);
        System.out.println("Parking name in Descending Order");
        for(ParkingDTO ref:list)
        {
            System.out.println(ref);
        }
    }
    }

