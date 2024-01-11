package com.programe.collectionDTO;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EscalatorDTO {
    private int speed;
    private int capacity;
    private String directionOfTravel;
    private int stepWidth;
}
