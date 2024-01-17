package com.programe.collectionDTO;

import lombok.*;

import java.util.PrimitiveIterator;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class RopeDTO implements Comparable<RopeDTO>{
    private double length;
    private String type;
    private  double cost;
    private String color;
    @Override
    public int compareTo(RopeDTO o) {

        return this.color.compareTo(o.getColor());
    }
}
