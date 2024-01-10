package com.programe.CollectionComparator;

import com.programe.collectionDTO.RefillDTO;

import java.util.Comparator;

public class RefillComparatorType implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
