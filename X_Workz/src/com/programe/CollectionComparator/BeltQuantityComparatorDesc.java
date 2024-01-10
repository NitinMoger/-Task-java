package com.programe.CollectionComparator;

import com.programe.collectionDTO.BeltDTO;

import java.util.Comparator;

public class BeltQuantityComparatorDesc implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        Integer ref1 = o1.getQuantity();
        Integer ref2 = o2.getQuantity();
        return ref2.compareTo(ref1);
    }

}
