package com.Xworkz.InterfaceExampe;

import lombok.*;

@NoArgsConstructor
@ToString
@AllArgsConstructor
@Getter
@Setter
public class Ticket implements Cloneable{
    int quantity;
    String movieName;
    double price;
    String theaterName;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
