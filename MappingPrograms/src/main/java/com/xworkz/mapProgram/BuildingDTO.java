package com.xworkz.mapProgram;


import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BuildingDTO {
    private int noOfFloor;
    private String buildingName;
    private int buildingNo;

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof BuildingDTO)) {
            return false;
        }
        BuildingDTO buildingDTO=(BuildingDTO) obj;
        return Objects.equals(getBuildingName(),buildingDTO.getBuildingName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBuildingName());
    }

}
