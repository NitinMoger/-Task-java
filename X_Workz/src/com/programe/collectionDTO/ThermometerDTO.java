package com.programe.collectionDTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ThermometerDTO {
    private String type;
    private String displayType;
    private String material;
    private double cost;
}
