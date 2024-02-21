package com.programe.mapProgram;

import sun.awt.SunHints;

import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ShirtBrandMapping {

    public static void main(String[] args) {


        Map<String,String> map= new HashMap<>();
        map.put("Oxford Collar Shirt","oxford");
        map.put("fullSleeve","peterEngland");
        map.put("halfSleeve","Polo");
        map.put("ArrorShrirt","Raymond");

        System.out.println( map.keySet());
        System.out.println(map.values());


        Map<String,String> wallColorMap=new HashMap<>();
        wallColorMap.put("load bearing Walls","red");
        wallColorMap.put("Cavity Walls","Green");
        wallColorMap.put("Panel Walls","Yellow");
        wallColorMap.put("Shear Walls","Gray");
        wallColorMap.put("faced Wall","Pink");

        System.out.println("=======================");
        System.out.println(wallColorMap.keySet());
        System.out.println(wallColorMap.values());

        Map<String,String> tvBrandMap=new HashMap<>();
        tvBrandMap.put("LED","Onida");
        tvBrandMap.put("Oled","Samsung");
        tvBrandMap.put("LCD","realme");
        tvBrandMap.put("4K","MI");
        tvBrandMap.put("Plasma","LG");

        System.out.println("=======================");
        System.out.println(wallColorMap.keySet());
        System.out.println(wallColorMap.values());


        Map<String,String[]> foodIngridientsMap=new HashMap<>();
        foodIngridientsMap.put("Kabab",new String[]{"chilli,salt,oil,chicken"});
        foodIngridientsMap.put("Biryani",new String[]{"chilli,salt,Rice,chicken"});
        foodIngridientsMap.put("Samosa",new String[]{"Maida,salt,oil,Onion"});
        foodIngridientsMap.put("Chilli",new String[]{"Chicken,salt,oil,Chilli,Onion"});
        foodIngridientsMap.put("Paneer Tikka",new String[]{"Panneer,salt,Masala,Onion,Ginger"});

        System.out.println("=============================");
        System.out.println(foodIngridientsMap.keySet());
        System.out.println(foodIngridientsMap.values());

        Map<String,String> landOwnerMap=new HashMap<>();
        landOwnerMap.put("Bengaluru","Ravi");
        landOwnerMap.put("Sirsi","Shambhu");
        landOwnerMap.put("Davnagere","Anil");
        landOwnerMap.put("Udupi","Sushan");
        landOwnerMap.put("Mangaluru","Dinesh");

        System.out.println("=============================");
        System.out.println(landOwnerMap.keySet());
        System.out.println(landOwnerMap.values());



    }
}
