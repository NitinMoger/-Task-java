package com.xworkz.mapProgram;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressDTO implements Serializable,Comparable<AddressDTO> {

    public int no;
    public int pincode;
    public String street;

    @Override
    public int compareTo(AddressDTO o) {
        return 0;
    }


}
