package com.programe.collectionRunner;

import com.programe.collectionDTO.DiseaseDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiseaseDTORunner {
    public static void main(String[] args) {

        DiseaseDTO diseaseDTO=new DiseaseDTO("Infectious","Bacteria","Exposure or Entry","Fever");
        DiseaseDTO diseaseDTO1=new DiseaseDTO("corona","Bacteria","Exposure or Entry","Fever");
        DiseaseDTO diseaseDTO2=new DiseaseDTO("Asthma","Environmental Exposures","Airway Inflammation","Coughing");
        DiseaseDTO diseaseDTO3=new DiseaseDTO("Infectious","Bacteria","Exposure or Entry","Fever");
        DiseaseDTO diseaseDTO4=new DiseaseDTO("Covid-19","Bacteria","Exposure or Entry","Fever");

        List<DiseaseDTO> list = new ArrayList<>();
        list.add(diseaseDTO2);
        list.add(diseaseDTO1);
        list.add(diseaseDTO3);
        list.add(diseaseDTO);
        list.add(diseaseDTO4);

        Collections.sort(list);
        System.out.println("Ascending Order on Location");
        for (DiseaseDTO ref:list)
        {
            System.out.println(ref);
        }

//        System.out.println("Ascending order depends on name");
//        Collections.sort(list,(p1, p2)->String.CASE_INSENSITIVE_ORDER.compare(p1.getName(), p2.getName()));
//        list.forEach(p-> System.out.println(p));

        System.out.println("Ascending order depends on Pathogenesis");
        Collections.sort(list,(p1,p2)->String.CASE_INSENSITIVE_ORDER.compare(p1.getPathogenesis(), p2.getPathogenesis()));
        list.forEach(p-> System.out.println(p));

        System.out.println("Ascending order depends on Etiology");
        Collections.sort(list,(p1,p2)->String.CASE_INSENSITIVE_ORDER.compare(p1.getEtiology(), p2.getEtiology()));
        list.forEach(p-> System.out.println(p));

        System.out.println("Ascending order depends on name");
        Collections.sort(list,(p1,p2)->String.CASE_INSENSITIVE_ORDER.compare(p1.getSymptoms(), p2.getSymptoms()));
        list.forEach(p-> System.out.println(p));



    }
}
