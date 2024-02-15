package com.programe.collectionComparator;

import com.programe.collectionDTO.BeltDTO;

import java.util.Comparator;

public class BeltTypeComparatorDesc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        String ref1 = o1.getType();
        String ref2 = o2.getType();
        return ref2.compareTo(ref1);
    }

}
