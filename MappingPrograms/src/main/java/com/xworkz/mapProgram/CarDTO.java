package com.xworkz.mapProgram;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarDTO implements Serializable {
    private String CarName;
    private String company;
    private int model;

    @Override
    public boolean equals(Object o) {
        System.out.println("Running Equals");
        if (this == o) return true;
        if (!(o instanceof CarDTO)) return false;
        CarDTO carDTO = (CarDTO) o;
        return Objects.equals(getCompany(), carDTO.getCompany());
    }

    @Override
    public int hashCode() {
        System.out.println("Running HashCode");
        return Objects.hash(getCompany());
    }
}
