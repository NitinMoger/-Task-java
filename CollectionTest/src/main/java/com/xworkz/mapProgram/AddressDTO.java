package com.xworkz.mapProgram;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class AddressDTO implements Serializable {

    private String city;

}
