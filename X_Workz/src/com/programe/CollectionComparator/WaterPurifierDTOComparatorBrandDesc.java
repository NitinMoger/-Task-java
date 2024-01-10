package com.programe.CollectionComparator;

import com.programe.collectionDTO.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierDTOComparatorBrandDesc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getBrand(), o1.getBrand());
    }
}
