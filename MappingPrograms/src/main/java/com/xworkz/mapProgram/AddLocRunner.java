package com.xworkz.mapProgram;

import java.util.HashMap;
import java.util.Map;

public class AddLocRunner {
    public static void main(String[] args) {
        BuildingDTO buildingDTO1=new BuildingDTO(1,"MindTree",123);
        BuildingDTO buildingDTO3=new BuildingDTO(3,"HP",162);
        BuildingDTO buildingDTO2=new BuildingDTO(2,"Indiquebe",127);
        BuildingDTO buildingDTO4=new BuildingDTO(3,"Dell",114);
        BuildingDTO buildingDTO5=new BuildingDTO(1,"Intel",115);
        BuildingDTO buildingDTO6=new BuildingDTO(5,"Seimens",136);
        BuildingDTO buildingDTO7=new BuildingDTO(4,"Infosys",121);
        BuildingDTO buildingDTO8=new BuildingDTO(3,"Infotech",118);
        BuildingDTO buildingDTO9=new BuildingDTO(5,"DXC",100);


        LocationDTO locationDTO1=new LocationDTO(560076,"vijayNagar",9329839402l);
        LocationDTO locationDTO2=new LocationDTO(560073,"BTM 2nd stage",6234567809l);
        LocationDTO locationDTO3=new LocationDTO(565321,"BTM 1st stage",8234567890l);
        LocationDTO locationDTO4=new LocationDTO(560098,"JP nagar",6364208702l);
        LocationDTO locationDTO5=new LocationDTO(560071,"Vijayanagar",8861021958l);
        LocationDTO locationDTO6=new LocationDTO(560031,"Jayanagar",9591064376l);
        LocationDTO locationDTO7=new LocationDTO(560032,"Konankunte",6362433200l);
        LocationDTO locationDTO8=new LocationDTO(560022,"Hosnagar",652489712l);
        LocationDTO locationDTO9=new LocationDTO(567842,"Kengeri",856789123l);


        Map<BuildingDTO,LocationDTO> map=new HashMap<>();
        map.put(buildingDTO1,locationDTO1);
        map.put(buildingDTO2,locationDTO2);
        map.put(buildingDTO3,locationDTO3);
        map.put(buildingDTO4,locationDTO4);
        map.put(buildingDTO5,locationDTO5);
        map.put(buildingDTO6,locationDTO6);
        map.put(buildingDTO7,locationDTO7);
        map.put(buildingDTO8,locationDTO8);
        map.put(buildingDTO9,locationDTO9);

        BuildingDTO buildingDTO10=new BuildingDTO(10,"SMS",110);
        LocationDTO locationDTO10=new LocationDTO(123476,"Chickpete",7894561230l);
        map.put(buildingDTO10,locationDTO10);
        map.forEach((k,v)-> System.out.println(k+":"+v));
     }

}
