package com.programe.collectionComparator;

import com.programe.collectionDTO.SpeakerDTO;

import java.util.Comparator;

public class SpeakerComparatorBrand implements Comparator<SpeakerDTO>{
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getBrand(), o2.getBrand());
    }

}
