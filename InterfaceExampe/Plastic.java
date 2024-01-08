package com.Xworkz.InterfaceExampe;

import lombok.*;

@NoArgsConstructor
@ToString
@Getter @Setter
@AllArgsConstructor
public class Plastic implements Cloneable {
    int quantity;
    String plasticName;
    double price;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
