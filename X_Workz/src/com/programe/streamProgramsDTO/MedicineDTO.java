package com.programe.streamProgramsDTO;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MedicineDTO implements Comparable<MedicineDTO> {

    private String name;
    private int id;
    private String companyName;
    private LocalDate expirayDate;
    private LocalDate manfDate;
    private String[] ingredients;
    private double cost;



//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    @Override
    public int compareTo(MedicineDTO o) {
        return this.companyName.compareTo(o.companyName);
    }
}

