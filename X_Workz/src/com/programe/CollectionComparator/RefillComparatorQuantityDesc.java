package com.programe.CollectionComparator;

import com.programe.collectionDTO.RefillDTO;

import java.util.Comparator;

public class RefillComparatorQuantityDesc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
