package com.programe.collectionDTO;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class PinDTO implements Comparable<PinDTO>{
    private String type;
    private double cost;
    private String use;

    @Override
    public int compareTo(PinDTO o) {
        return Double.compare(this.cost,o.getCost());
    }
}
