package com.programe.collectionDTO;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class PaperDTO implements Serializable {

    private String type;
    private double weight;
    private double cost;
    private int quantity;
}
