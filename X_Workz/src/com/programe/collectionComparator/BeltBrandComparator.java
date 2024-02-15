package com.programe.collectionComparator;

import com.programe.collectionDTO.BeltDTO;

import java.util.Comparator;

public class BeltBrandComparator  implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        String ref2=o1.getBrand();
        String ref3=o2.getBrand();
        return ref2.compareTo(ref3);
    }
}
