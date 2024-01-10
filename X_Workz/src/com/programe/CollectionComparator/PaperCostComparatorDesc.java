package com.programe.CollectionComparator;

import com.programe.collectionDTO.PaperDTO;

import java.util.Comparator;

public class PaperCostComparatorDesc implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        Double ref1=o1.getCost();
        Double ref2=o2.getCost();
        return ref2.compareTo(ref1);
    }
}
