package com.programe.CollectionComparator;

import com.programe.collectionDTO.SensorDTO;

import java.util.Comparator;

public class SensorComparatorCostDesc implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
