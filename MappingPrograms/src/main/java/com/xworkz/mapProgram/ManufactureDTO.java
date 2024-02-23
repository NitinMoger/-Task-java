package com.xworkz.mapProgram;

import lombok.*;

import java.io.Serializable;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ManufactureDTO implements Serializable {

    private String name;
    private String country;
    private int version;
}
