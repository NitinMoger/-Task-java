package com.programe.collectionDTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CoverDTO {
    private String type;
    private double cost;
    private String color;
    private double size;
}
