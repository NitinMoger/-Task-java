package com.programe.collectionDTO;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class AlaramDTO implements Comparable<AlaramDTO>{
    private String type;
    private int quantity;
    private double cost;

    @Override
    public int compareTo(AlaramDTO o) {
        return this.type.compareTo(o.getType());
    }

}
