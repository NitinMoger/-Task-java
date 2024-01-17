package com.programe.collectionDTO;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class NeedleDTO implements Comparable<NeedleDTO>{
    private double length;
    private double weight;
    @Override
    public int compareTo(NeedleDTO o) {
        return Double.compare(this.length,o.getLength());
    }
}
