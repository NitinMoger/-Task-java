package com.programe.collectionDTO;

import lombok.*;

@NoArgsConstructor
@Setter
@ToString
@Getter
@AllArgsConstructor
public class WingsDTO implements Comparable<WingsDTO> {
    private Double cost;
    private String type;
    private int warranty;
    @Override
    public int compareTo(WingsDTO o) {
        return Integer.compare(this.warranty,o.warranty);
    }


}
