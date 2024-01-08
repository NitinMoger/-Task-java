package com.xworkz.task;

public class Lens {
    int pixel;
    String name;
    double price;

    Lens()
    {
        System.out.println("no argument constructor of Lens");
    }
    public Lens(int pixel,String name,double price)
    {
        this.pixel=pixel;
        this.name=name;
        this.price=price;
        System.out.println("Pixel of the lense:"+this.pixel);
        System.out.println("Name of the lense:"+this.name);
        System.out.println("Name of the lense:"+this.price);
        System.out.println("constructor have argument with int,String,double");
    }
}
