package com.programe.CollectionComparator;

import com.programe.collectionDTO.SensorDTO;

import java.util.Comparator;

public class SensorComparatorDistance implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return Integer.compare(o1.getDistance(), o2.getDistance());
    }
}
