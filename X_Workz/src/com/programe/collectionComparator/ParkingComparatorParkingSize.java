package com.programe.collectionComparator;

import com.programe.collectionDTO.ParkingDTO;

import java.util.Comparator;

public class ParkingComparatorParkingSize  implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o1.getParkingSize(), o2.getParkingSize());
    }
}
