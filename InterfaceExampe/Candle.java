package com.Xworkz.InterfaceExampe;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Candle implements Cloneable{
 String brand;
 double length;
 double cost;
 String type;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
