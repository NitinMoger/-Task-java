package com.programe.collectionDTO;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ParkingDTO {
    private String vehicleType;
    private int totalNumVehicle;
    private double parkingSize;
    private String name;

}
