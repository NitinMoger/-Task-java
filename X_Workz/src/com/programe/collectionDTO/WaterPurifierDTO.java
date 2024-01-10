package com.programe.collectionDTO;


import lombok.*;

@AllArgsConstructor
@Getter
@Setter@NoArgsConstructor
@ToString
public class WaterPurifierDTO {
    private String type;
    private int quantity;
    private String brand;
    private double cost;
}
