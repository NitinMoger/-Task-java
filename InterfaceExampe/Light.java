package com.Xworkz.InterfaceExampe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Light implements Cloneable{
    String color;
    String type;
    double cost;
    int warranty;

    @Override
    public Light clone() throws CloneNotSupportedException {
        return (Light) super.clone();
    }
}
