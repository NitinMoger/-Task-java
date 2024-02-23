package com.xworkz.mapProgram;

import lombok.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


@NoArgsConstructor
@ToString
@AllArgsConstructor
@Setter
@Getter
public class PersonDTO implements Serializable {

public String name;
public String email;


    @Override
    public boolean equals(Object o) {
        System.out.println("running equals in person");
//        if (this == o) return true;
        if (!(o instanceof PersonDTO)) return false;
        PersonDTO personDTO = (PersonDTO) o;
        return Objects.equals(getEmail(), personDTO.getEmail());
    }

    @Override
    public int hashCode() {
        System.out.println("running hashcode in person");
        return Objects.hash(getEmail());
    }
}
