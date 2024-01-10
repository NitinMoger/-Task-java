package com.programe.CollectionComparator;

import com.programe.collectionDTO.SensorDTO;

import java.util.Comparator;

public class SensorComparatorNameDesc implements Comparator<SensorDTO> {

    @Override
    public int compare(SensorDTO o1, SensorDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getName(), o1.getName());
    }

}
