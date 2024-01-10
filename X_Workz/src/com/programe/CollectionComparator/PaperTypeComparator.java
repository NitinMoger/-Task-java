package com.programe.CollectionComparator;

import com.programe.collectionDTO.PaperDTO;

import java.util.Comparator;

public class PaperTypeComparator implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        String ref1=o1.getType();
        String ref2=o2.getType();
        return ref1.compareTo(ref2);
    }
}
