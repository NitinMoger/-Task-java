package com.programe.CollectionComparator;

import com.programe.collectionDTO.CharcoalDTO;

import java.util.Comparator;

public class CharcoalComparatorCost implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}
