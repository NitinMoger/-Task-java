package com.programe.collectionDTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor@NoArgsConstructor
@ToString
public class RefillDTO {
    private int quantity;
    private double cost;
    private String type;
    private String brand;
}
