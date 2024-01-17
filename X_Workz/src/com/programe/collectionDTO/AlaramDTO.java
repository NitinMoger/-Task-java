package com.programe.collectionDTO;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class AlaramDTO implements Comparable<AlaramDTO>{
    private String type;
    private int quantity;
    private double cost;

    @Override
    public int compareTo(AlaramDTO o) {
        int no= Integer.compare(this.quantity,o.quantity);
        return no;
    }

}
