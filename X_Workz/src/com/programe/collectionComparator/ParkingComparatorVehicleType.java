package com.programe.collectionComparator;

import com.programe.collectionDTO.ParkingDTO;

import java.util.Comparator;

public class ParkingComparatorVehicleType implements Comparator<ParkingDTO> {
        @Override
        public int compare(ParkingDTO o1, ParkingDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getVehicleType(), o2.getVehicleType());
    }
}
