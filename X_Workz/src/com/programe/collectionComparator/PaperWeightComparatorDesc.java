package com.programe.collectionComparator;

import com.programe.collectionDTO.PaperDTO;

import java.util.Comparator;

public class PaperWeightComparatorDesc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        Double ref=o1.getWeight();
        Double ref1=o2.getWeight();
        return ref1.compareTo(ref);
    }
}
