package com.programe.CollectionComparator;

import com.programe.collectionDTO.CharcoalDTO;

import java.util.Comparator;

public class CharcoalComparatorType implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
