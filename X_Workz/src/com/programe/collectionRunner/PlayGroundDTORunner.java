package com.programe.collectionRunner;

import com.programe.collectionDTO.PlayGroundDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayGroundDTORunner {
    public static void main(String[] args) {
        PlayGroundDTO playGroundDTO=new PlayGroundDTO("Vivekananda","BTM",200,"Athletics");
        PlayGroundDTO playGroundDTO1=new PlayGroundDTO("Vishveshwarya","Jayanagar",400,"Kabaddi");
        PlayGroundDTO playGroundDTO2=new PlayGroundDTO("Nandanavana","Mahadevpura",400,"Cricket");
        PlayGroundDTO playGroundDTO3=new PlayGroundDTO("Rajashankar","Rajajinagar",200,"Vollyball");
        PlayGroundDTO playGroundDTO4=new PlayGroundDTO("Gandhi","Malleswara",800,"FootBall");

        List<PlayGroundDTO> playGroundDTOS=new ArrayList<>();
        playGroundDTOS.add(playGroundDTO2);
        playGroundDTOS.add(playGroundDTO1);
        playGroundDTOS.add(playGroundDTO);
        playGroundDTOS.add(playGroundDTO3);
        playGroundDTOS.add(playGroundDTO4);

        //Defaoult
        Collections.sort(playGroundDTOS);
        System.out.println("Ascending Order on Location");
        for (PlayGroundDTO ref:playGroundDTOS)
        {
            System.out.println(ref);
        }

//        System.out.println("Ascending order depends on Location");
//        Collections.sort(playGroundDTOS,(p1,p2)->String.CASE_INSENSITIVE_ORDER.compare(p1.getLocation(), p2.getLocation()));
//        playGroundDTOS.forEach(p-> System.out.println(p));


        System.out.println("Ascending order depends on name");
        Collections.sort(playGroundDTOS,(p1,p2)->String.CASE_INSENSITIVE_ORDER.compare(p1.getName(), p2.getName()));
        playGroundDTOS.forEach(p-> System.out.println(p));

        System.out.println("Ascending order depends on AreaInMeters");
        Collections.sort(playGroundDTOS,(p1,p2)->Integer.compare(p1.getAreaInMeters(), p2.getAreaInMeters()));
        playGroundDTOS.forEach(p-> System.out.println(p));

        System.out.println("Ascending order depends on NameOfGames");
        Collections.sort(playGroundDTOS,(p1,p2)->String.CASE_INSENSITIVE_ORDER.compare(p1.getNameOfGames(), p2.getNameOfGames()));
        playGroundDTOS.forEach(p-> System.out.println(p));

    }
}
