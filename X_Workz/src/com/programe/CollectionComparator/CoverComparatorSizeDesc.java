package com.programe.CollectionComparator;

import com.programe.collectionDTO.CoverDTO;

import java.util.Comparator;

public class CoverComparatorSizeDesc implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o2.getSize(), o1.getSize());
    }
}
