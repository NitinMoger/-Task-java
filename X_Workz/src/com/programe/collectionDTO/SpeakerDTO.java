package com.programe.collectionDTO;


import lombok.*;

@AllArgsConstructor
@ToString
@Setter
@Getter
@NoArgsConstructor
public class SpeakerDTO {
    private int quantity;
    private double cost;
    private String brand;
    private int warranty;

}
