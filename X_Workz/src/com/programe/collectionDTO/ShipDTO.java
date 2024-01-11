package com.programe.collectionDTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ShipDTO {

    private String types;
    private String safetyFeatures;
    private int cargoCapacity;
    private int passengerCapacity;
}
