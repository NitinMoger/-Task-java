package com.programe.CollectionComparator;

import com.programe.collectionDTO.RefillDTO;

import java.util.Comparator;

public class RefillComparatorCostDesc implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
