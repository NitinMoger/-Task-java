package com.Xworkz.InterfaceExampe;

import lombok.*;

@NoArgsConstructor
@ToString
@Getter
@Setter
@AllArgsConstructor
public class Scanner implements  Cloneable{
   private String brandName;
    private String color;
    private double cost;

//Scanner(){


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
