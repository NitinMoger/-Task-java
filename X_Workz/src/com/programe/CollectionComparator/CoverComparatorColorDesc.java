package com.programe.CollectionComparator;

import com.programe.collectionDTO.CoverDTO;

import java.util.Comparator;

public class CoverComparatorColorDesc implements Comparator<CoverDTO> {

    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getColor(), o1.getColor());
    }
}
