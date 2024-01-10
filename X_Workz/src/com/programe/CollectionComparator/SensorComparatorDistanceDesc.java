package com.programe.CollectionComparator;

import com.programe.collectionDTO.SensorDTO;

import java.util.Comparator;

public class SensorComparatorDistanceDesc implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Integer.compare(o2.getDistance(), o1.getDistance());
    }
}
