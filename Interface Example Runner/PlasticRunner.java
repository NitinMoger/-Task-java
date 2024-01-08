package com.Xworkz.boot;

import com.Xworkz.InterfaceExampe.Plastic;


public class PlasticRunner {

    public static void main(String[] args) throws CloneNotSupportedException {
        Plastic plastic=new Plastic(2,"Cover",30);
        Plastic plastic1=(Plastic) plastic.clone();
        Plastic plastic2=(Plastic) plastic.clone();
        Plastic plastic3=(Plastic) plastic.clone();
        Plastic plastic4=(Plastic) plastic.clone();
        System.out.println(plastic1);
        System.out.println(plastic2);
        System.out.println(plastic3);System.out.println(plastic4);

    }
}
