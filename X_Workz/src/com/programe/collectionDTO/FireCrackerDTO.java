package com.programe.collectionDTO;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class FireCrackerDTO implements Comparable<FireCrackerDTO>{
    private double heat;
    private String fuel;
    private String color;
    @Override
    public int compareTo(FireCrackerDTO o) {
        return this.color.compareTo(o.getColor());
    }
}
