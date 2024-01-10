package com.programe.CollectionComparator;

import com.programe.collectionDTO.BeltDTO;
import com.programe.collectionDTO.PaperDTO;

import java.util.Comparator;

public class BeltCostComparator  implements Comparator<BeltDTO> {

    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        Double ref2=o1.getCost();
        Double ref3=o2.getCost();
        return ref2.compareTo(ref3);
    }

}
