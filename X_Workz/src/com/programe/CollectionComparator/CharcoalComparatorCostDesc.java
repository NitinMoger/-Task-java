package com.programe.CollectionComparator;

import com.programe.collectionDTO.CharcoalDTO;

import java.util.Comparator;

public class CharcoalComparatorCostDesc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Double.compare(o2.getCost(), o1.getCost());
    }
}
