package com.xworkz.repository;

import com.xworkz.dto.DamDto;

public interface DamRepository {

public void save(DamDto damDto);

    public void update(String name, String place,String state,int height);

    public DamDto select(String name);
}
