package com.programe.streamProgramRunner;

import com.programe.streamProgramsDTO.MedicineDTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MedicineRunner{

    public static void main(String[] args) {

        MedicineDTO medicineDTO=new MedicineDTO("Armour Thyroid",121,"pfize",LocalDate.of(2022,02,10),LocalDate.of(2024,05,21),new String[]{"Croscarmellose sodium,Pregelatinized starch,Stearic acid,Microcrystalline cellulose"},50.0);
        MedicineDTO medicineDTO1=new MedicineDTO("Tylenol",112,"Johnson & Johnson",LocalDate.of(2020,03,20),LocalDate.of(2023,02,12), new String[]{"Ibuprofen", "Calcium stearate", "Colloidal silicon dioxide", "Croscarmellose sodium", "Microcrystalline cellulose","Microcrystalline cellulose"},20.0);
        MedicineDTO medicineDTO2=new MedicineDTO("Advil",123,"Pfizer",LocalDate.of(2019,02,10),LocalDate.of(2024,02,12),new String[]{"Cetirizine hydrochloride", "Colloidal silicon dioxide", "Lactose monohydrate", "Magnesium stearate", "Microcrystalline cellulose"},30.9);
        MedicineDTO medicineDTO3=new MedicineDTO("Nexium",124,"AstraZeneca",LocalDate.of(2018,6,28),LocalDate.of(2024,03,30), new String[]{"Loratadine", "Calcium phosphate", "Lactose monohydrate", "Magnesium stearate", "Pregelatinized starch"},30.5);
        MedicineDTO medicineDTO4=new MedicineDTO("Viagra",125,"Pfizer",LocalDate.of(2020,03,20),LocalDate.of(2023,02,12),new String[]{"Acetylsalicylic acid", "Corn starch", "Hypromellose", "Powdered cellulose", "Triacetin"},45.0);
        MedicineDTO medicineDTO5=new MedicineDTO("Zyrtec",126,"Johnson & Johnson",LocalDate.of(2023,03,20),LocalDate.of(2024,02,12),new String[]{"Croscarmellose sodium,Pregelatinized starch,Stearic acid,Microcrystalline cellulose"},35.5);
        MedicineDTO medicineDTO6=new MedicineDTO("Crestor ",127,"AstraZeneca ",LocalDate.of(2021,03,26),LocalDate.of(2024,12,22),new String[]{"Atorvastatin calcium", "Calcium carbonate", "Croscarmellose sodium", "Lactose monohydrate", "Microcrystalline cellulose"},40.0);
        MedicineDTO medicineDTO7=new MedicineDTO("Advil ",128,"AstraZeneca ",LocalDate.of(2020,03,19),LocalDate.of(2023,05,22), new String[]{"Esomeprazole magnesium", "Corn starch", "Crospovidone", "Hyprolose", "Magnesium stearate"},45.9);
        MedicineDTO medicineDTO8=new MedicineDTO("Crestor ",129,"AstraZeneca ",LocalDate.of(2022,12,21),LocalDate.of(2023,12,29),new String[]{"Albuterol sulfate", "Anhydrous lactose", "Microcrystalline cellulose", "Oleic acid"},55.5);
        MedicineDTO medicineDTO9=new MedicineDTO("Prozac ",130,"Merk&co.",LocalDate.of(2020,03,20),LocalDate.of(2023,02,12),new String[]{"Duloxetine hydrochloride", "FD&C Blue No. 2", "Gelatin", "Hypromellose", "Titanium dioxide"},90.5);
        MedicineDTO medicineDTO10=new MedicineDTO("Crestor ",131,"AstraZeneca ",LocalDate.of(2024,03,20),LocalDate.of(2026,02,12),new String[]{"Levothyroxine sodium", "Colloidal silicon dioxide", "Dibasic calcium phosphate dihydrate", "Lactose monohydrate", "Magnesium stearate"},40.5);
        MedicineDTO medicineDTO11=new MedicineDTO("Plavix ",132,"Bristol Myers Squibb ",LocalDate.of(2023,03,10),LocalDate.of(2024,02,12),new String[]{"Clopidogrel bisulfate", "Hydrogenated castor oil", "Hypromellose", "Microcrystalline cellulose", "Polyethylene glycol"},50.5);
        MedicineDTO medicineDTO12=new MedicineDTO("Humira ",133,"AbbVie ",LocalDate.of(2017,03,20),LocalDate.of(2022,12,22),new String[]{"Fluoxetine hydrochloride", "Colloidal silicon dioxide", "FD&C Blue No. 1", "FD&C Yellow No. 6", "Gelatin"},40.5);
        MedicineDTO medicineDTO13=new MedicineDTO("Synthroid ",134,"AbbVie ",LocalDate.of(2016,03,10),LocalDate.of(2022,04,27),new String[]{"Croscarmellose sodium,Pregelatinized starch,Stearic acid,Microcrystalline cellulose"},35.5);
        MedicineDTO medicineDTO14=new MedicineDTO("Singulair ",135,"Merck & Co ",LocalDate.of(2021,04,28),LocalDate.of(2023,03,31),new String[]{"Celecoxib", "Calcium phosphate", "Croscarmellose sodium", "Lactose monohydrate", "Magnesium stearate"},50.6);
        MedicineDTO medicineDTO15=new MedicineDTO("Crestor ",136,"AstraZeneca ",LocalDate.of(2022,03,20),LocalDate.of(2023,05,28), new String[]{"Metformin hydrochloride", "Hypromellose", "Magnesium stearate", "Polyethylene glycol", "Povidone"},35.5);
        MedicineDTO medicineDTO16=new MedicineDTO("Celebrex ",137,"Pfizer ",LocalDate.of(2021,11,20),LocalDate.of(2024,07,18),new String[]{"Methylphenidate hydrochloride", "Colloidal silicon dioxide", "Lactose monohydrate", "Pregelatinized starch", "Stearic acid"},40.5);
        MedicineDTO medicineDTO17=new MedicineDTO("Lyrica ",138,"Pfizer ",LocalDate.of(2022,12,20),LocalDate.of(2022,02,17), new String[]{"Oxycodone hydrochloride", "Ethylcellulose", "Hydroxypropyl cellulose", "Polyethylene glycol", "Povidone"},55.5);
        MedicineDTO medicineDTO18=new MedicineDTO("Xarelto ",139,"Merck & Co ",LocalDate.of(2023,10,20),LocalDate.of(2024,01,22), new String[]{"Alprazolam", "Colloidal silicon dioxide", "Corn starch", "Docusate sodium", "Lactose monohydrate"},60.5);
        MedicineDTO medicineDTO19=new MedicineDTO("Suboxone ",140,"Indivior ",LocalDate.of(2022,9,20),LocalDate.of(2024,06,12),new String[]{"Diphenhydramine hydrochloride", "Carnauba wax", "Crospovidone", "FD&C Blue No. 1", "Magnesium stearate"},40.5);



        List<MedicineDTO> list=new ArrayList<>();
        list.add(medicineDTO);
        list.add(medicineDTO1);
        list.add(medicineDTO2);
        list.add(medicineDTO3);
        list.add(medicineDTO4);
        list.add(medicineDTO5);
        list.add(medicineDTO6);
        list.add(medicineDTO7);
        list.add(medicineDTO8);
        list.add(medicineDTO9);
        list.add(medicineDTO10);
        list.add(medicineDTO11);
        list.add(medicineDTO12);
        list.add(medicineDTO13);
        list.add(medicineDTO14);
        list.add(medicineDTO15);
        list.add(medicineDTO16);
        list.add(medicineDTO17);
        list.add(medicineDTO18);
        list.add(medicineDTO19);

        System.out.println("Sorted Company Name in Desc");
        list.stream().sorted(Comparator.reverseOrder()).forEach(r-> System.out.println(r));


        System.out.println("===============================");
        System.out.println("sort all by cost ascending order");
        list.stream().sorted((c1, c2) -> Double.compare(c1.getCost(), c2.getCost()))
                .forEach(l -> System.out.println(l));




        System.out.println("==============================================");
        System.out.println("collect only name in lower case and sort in descending order ");
        list.stream().map(MedicineDTO::getName).map(String::toLowerCase).sorted(Collections.reverseOrder())
                .forEach(l -> System.out.println(l));


        System.out.println("==============================================");
        System.out.println("collect all manufacture date less than 30 days");
        list.stream().filter(l -> l.getManfDate().isBefore(LocalDate.now().plusDays(30))).forEach(l -> System.out.println(l));


        System.out.println("sort all medicine by company name");
        Collections.sort(list);
        list.forEach(l -> System.out.println(l));
        System.out.println("========================================");


        System.out.println("sort all by expiry date desc");
        list.stream().sorted((e1, e2) -> e2.getExpirayDate().compareTo(e1.getExpirayDate()))
                .forEach(l -> System.out.println(l));


        System.out.println("=================================================");
        System.out.println("collect all elements where ingredients greater than 5");
        List<MedicineDTO> list1 = list.stream().filter(l -> l.getIngredients().length > 5).collect(Collectors.toList());
        list1.forEach(l -> System.out.println(l));


        System.out.println("====================================================");
        System.out.println("collect only ingredients");
        List<String[]> list2 = list.stream().map(MedicineDTO::getIngredients).collect(Collectors.toList());
        list2.forEach(list4 -> {
            for (String i : list4)
            {
                System.out.println(i);
            }
        });


        System.out.println("==============================================");
        System.out.println("collect all expiry date less than 30 days");
        list.stream().filter(l -> l.getExpirayDate().isBefore(LocalDate.now())).forEach(l -> System.out.println(l));


        System.out.println("==============================================");
        System.out.println("collect all manufacture date greater than 30 days");
        list.stream().filter(l->l.getManfDate().isAfter(LocalDate.now().plusDays(30))).forEach(r-> System.out.println(r));

    }
}








