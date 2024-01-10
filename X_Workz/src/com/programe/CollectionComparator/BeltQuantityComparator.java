package com.programe.CollectionComparator;

import com.programe.collectionDTO.BeltDTO;

import java.util.Comparator;

public class BeltQuantityComparator implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        Integer ref1 = o1.getQuantity();
        Integer ref2 = o2.getQuantity();
        return ref1.compareTo(ref2);
    }
}