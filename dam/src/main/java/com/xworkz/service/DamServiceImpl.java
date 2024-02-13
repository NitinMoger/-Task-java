package com.xworkz.service;

import com.xworkz.dto.DamDto;
import com.xworkz.repository.DamRepository;
import com.xworkz.repository.DamRepositoryImpl;

public class DamServiceImpl implements DamService{

    DamRepository damRepository=new DamRepositoryImpl();
    @Override
    public void save(DamDto damDto) {

        if(damDto.getName().isEmpty())
        {
            System.out.println("PLease give a valid Information");
        }else {
            damRepository.save(damDto);
        }
    }

    @Override
    public void update(String name, String place, String state, int height) {
        if(name==null||name.isEmpty())
        {
            System.out.println("Enter Valid Name");
        }else {
            damRepository.update(name,place,state,height);
        }
    }

    @Override
    public DamDto select(String name) {

        if(name==null)
        {
            System.out.println("pleaee give a valid name");
        }else {
           DamDto damDto= damRepository.select(name);
            return damDto;
        }
        return null;
    }
}
