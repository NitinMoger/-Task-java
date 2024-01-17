package com.programe.collectionDTO;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class CardBoardDTO implements Comparable<CardBoardDTO>{
    private String color;
    private double cost;
    private int quantity;
    @Override
    public int compareTo(CardBoardDTO o) {
        return Integer.compare(this.quantity,o.getQuantity());
    }
}
