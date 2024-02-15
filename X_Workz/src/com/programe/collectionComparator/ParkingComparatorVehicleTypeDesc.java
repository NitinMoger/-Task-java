package com.programe.collectionComparator;

import com.programe.collectionDTO.ParkingDTO;

import java.util.Comparator;

public class ParkingComparatorVehicleTypeDesc implements Comparator<ParkingDTO> {

    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getVehicleType(), o1.getVehicleType());
    }
}
