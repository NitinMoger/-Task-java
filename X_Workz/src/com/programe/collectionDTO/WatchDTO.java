package com.programe.collectionDTO;


import lombok.*;

import java.io.Serializable;
import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WatchDTO implements Serializable,Comparable<WatchDTO> {

    private String brand;
    private int warranty;
    private double price;
    private String material;


    @Override
    public int compareTo(WatchDTO o) {
        return Integer.compare(this.getWarranty(),o.getWarranty());
    }
}
