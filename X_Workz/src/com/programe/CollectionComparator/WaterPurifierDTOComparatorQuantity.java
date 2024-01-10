package com.programe.CollectionComparator;

import com.programe.collectionDTO.SpeakerDTO;
import com.programe.collectionDTO.WaterPurifierDTO;

import java.util.Comparator;

public class WaterPurifierDTOComparatorQuantity implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }

}
