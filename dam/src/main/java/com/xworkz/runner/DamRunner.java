package com.xworkz.runner;

import com.xworkz.dto.DamDto;
import com.xworkz.repository.DamRepository;
import com.xworkz.repository.DamRepositoryImpl;
import com.xworkz.service.DamService;
import com.xworkz.service.DamServiceImpl;

public class DamRunner {
    public static void main(String[] args) {

        DamService damService=new DamServiceImpl();
//       DamDto damDto1=new DamDto("KR","Mysore","Ka",4);
//        //DamDto damDto2=new DamDto("Hemavathi","Hasan","Karnataka",50);
//
//       damService.save(damDto1);
//       //damService.save(damDto2);
//
//
//        damService.update("Vijayanagar","Bengaluru","Karnataka",30);
        DamRepository damRepository=new DamRepositoryImpl();
        DamDto damDto1=damService.select("KR");
        if(damDto1.getName()==null)
        {
            System.out.println("Give proper Name");
        }
        else {
            System.out.println("The dam name is:"+damDto1.getName());
        }


    }
}
