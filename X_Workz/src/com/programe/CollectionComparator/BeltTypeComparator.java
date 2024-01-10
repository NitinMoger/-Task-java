package com.programe.CollectionComparator;

import com.programe.collectionDTO.BeltDTO;
import com.programe.collectionDTO.PaperDTO;

import java.util.Comparator;

public class BeltTypeComparator implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        String ref1 = o1.getType();
        String ref2 = o2.getType();
        return ref1.compareTo(ref2);
    }
}
