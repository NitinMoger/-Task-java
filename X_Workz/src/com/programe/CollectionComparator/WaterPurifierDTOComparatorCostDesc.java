package com.programe.CollectionComparator;

import com.programe.collectionDTO.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierDTOComparatorCostDesc implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());

    }
}
