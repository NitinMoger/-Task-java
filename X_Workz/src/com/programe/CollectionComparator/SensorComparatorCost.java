package com.programe.CollectionComparator;

import com.programe.collectionDTO.SensorDTO;

import java.util.Comparator;

public class SensorComparatorCost implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
