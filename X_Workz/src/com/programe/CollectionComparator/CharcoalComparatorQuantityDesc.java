package com.programe.CollectionComparator;

import com.programe.collectionDTO.CharcoalDTO;

import java.util.Comparator;

public class CharcoalComparatorQuantityDesc implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
