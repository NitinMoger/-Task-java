package com.programe.CollectionComparator;

import com.programe.collectionDTO.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierDTOComparatorQuantityDesc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }

}
