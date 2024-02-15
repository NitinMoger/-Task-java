package com.programe.collectionComparator;

import com.programe.collectionDTO.ParkingDTO;

import java.util.Comparator;

public class ParkingComparatortotalNumVehicle implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Integer.compare(o1.getTotalNumVehicle(), o2.getTotalNumVehicle());
    }
}
