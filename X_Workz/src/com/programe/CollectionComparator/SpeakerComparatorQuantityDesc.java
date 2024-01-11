package com.programe.CollectionComparator;

import com.programe.collectionDTO.SpeakerDTO;

import java.util.Comparator;

public class SpeakerComparatorQuantityDesc implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
