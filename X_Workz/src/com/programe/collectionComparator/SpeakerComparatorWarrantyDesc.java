package com.programe.collectionComparator;

import com.programe.collectionDTO.SpeakerDTO;

import java.util.Comparator;

public class SpeakerComparatorWarrantyDesc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Integer.compare(o2.getWarranty(), o1.getWarranty());
    }
}
