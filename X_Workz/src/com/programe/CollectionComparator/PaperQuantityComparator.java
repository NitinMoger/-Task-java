package com.programe.CollectionComparator;

import com.programe.collectionDTO.PaperDTO;

import java.util.Comparator;

public class PaperQuantityComparator implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        Integer ref1=o1.getQuantity();
        Integer ref2=o2.getQuantity();
        return ref1.compareTo(ref2);
    }
}
