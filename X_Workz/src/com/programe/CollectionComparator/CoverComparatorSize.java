package com.programe.CollectionComparator;

import com.programe.collectionDTO.CoverDTO;

import java.util.Comparator;

public class CoverComparatorSize implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        return Double.compare(o1.getSize(), o2.getSize());
    }

}
