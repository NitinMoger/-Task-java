package com.programe.CollectionComparator;

import com.programe.collectionDTO.PaperDTO;

import java.util.Comparator;

public class PaperCostComparator implements Comparator<PaperDTO> {

    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        Double ref2=o1.getCost();
        Double ref3=o2.getCost();
        return ref2.compareTo(ref3);
    }

}
