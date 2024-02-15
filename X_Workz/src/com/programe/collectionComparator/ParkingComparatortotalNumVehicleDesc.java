package com.programe.collectionComparator;

import com.programe.collectionDTO.ParkingDTO;

import java.util.Comparator;

public class ParkingComparatortotalNumVehicleDesc  implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        return Integer.compare(o2.getTotalNumVehicle(), o1.getTotalNumVehicle());
    }
}
