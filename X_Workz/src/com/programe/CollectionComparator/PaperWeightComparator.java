package com.programe.CollectionComparator;

import com.programe.collectionDTO.PaperDTO;

import java.util.Comparator;

public class PaperWeightComparator implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        Double ref1=o1.getWeight();
        Double ref2=o2.getWeight();
        return ref1.compareTo(ref2);
    }
}
