package com.programe.collectionDTO;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlayGroundDTO implements Serializable,Comparable<PlayGroundDTO> {
    private String name;
    private String location;
    private int AreaInMeters;
    private String nameOfGames;

    @Override
    public int compareTo(PlayGroundDTO o) {
        return this.location.compareTo(o.getLocation());
    }
}
