package com.programe.CollectionComparator;

import com.programe.collectionDTO.CoverDTO;

import java.util.Comparator;

public class CoverComparatorType implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getType(), o2.getType());
    }
}
