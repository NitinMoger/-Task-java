package com.programe.collectionDTO;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DiseaseDTO implements Serializable,Comparable<DiseaseDTO> {
    private String name;
    private String etiology;
    private String pathogenesis;
    private String symptoms;
    @Override
    public int compareTo(DiseaseDTO o) {
        return String.CASE_INSENSITIVE_ORDER.compare(this.getName(),o.getName());
    }
}
