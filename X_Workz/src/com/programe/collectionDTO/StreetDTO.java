package com.programe.collectionDTO;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StreetDTO {
    private String streetName;
    private int totalShops;
    private String shopName;
    private double streetLength;
}
