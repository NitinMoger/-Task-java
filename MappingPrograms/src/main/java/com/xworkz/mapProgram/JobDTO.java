package com.xworkz.mapProgram;


import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JobDTO {
    private String designation;
    private double salary;
    private int jobId;

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof JobDTO)) return false;
        JobDTO jobDTO=(JobDTO) obj;
        return Objects.equals(getSalary(),jobDTO.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSalary());
    }

}
