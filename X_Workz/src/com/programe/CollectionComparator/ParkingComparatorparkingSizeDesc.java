package com.programe.CollectionComparator;

import com.programe.collectionDTO.ParkingDTO;

import java.util.Comparator;

public class ParkingComparatorparkingSizeDesc  implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Double.compare(o2.getParkingSize(), o1.getParkingSize());
    }
}
