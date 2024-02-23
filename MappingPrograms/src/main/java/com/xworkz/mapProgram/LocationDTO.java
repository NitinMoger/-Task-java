package com.xworkz.mapProgram;

import lombok.*;

import java.io.Serializable;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LocationDTO implements Serializable {

    private int pincode;
    private String streetName;
    private long ownerNo;

}
