package com.programe.CollectionComparator;

import com.programe.collectionDTO.SpeakerDTO;

import java.util.Comparator;

public class SpeakerComparatorWarranty implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Integer.compare(o1.getWarranty(), o2.getWarranty());
    }

}
