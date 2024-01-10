package com.programe.CollectionComparator;

import com.programe.collectionDTO.ParkingDTO;
import com.programe.collectionDTO.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierDTOComparatorType implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
