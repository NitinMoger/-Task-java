package com.programe.collectionDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SensorDTO {
    private  String name;
    private String type;
    private double cost;
    private int distance;
}

