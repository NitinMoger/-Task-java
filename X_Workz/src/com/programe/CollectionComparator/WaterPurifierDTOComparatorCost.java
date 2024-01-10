package com.programe.CollectionComparator;

import com.programe.collectionDTO.SpeakerDTO;
import com.programe.collectionDTO.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierDTOComparatorCost implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());

    }
}
