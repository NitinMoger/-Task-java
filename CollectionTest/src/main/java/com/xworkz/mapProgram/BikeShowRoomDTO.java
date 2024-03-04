package com.xworkz.mapProgram;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BikeShowRoomDTO implements Serializable {

    public String name;
    public int pincode;
}
