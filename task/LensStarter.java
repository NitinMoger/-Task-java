package com.xworkz.task;

public class LensStarter {
    public static void main(String[] args)
    {
        System.out.println("Start the main in LensStarter");
        Lens lens=new Lens(20,"Canon",2500);
        System.out.println(lens.toString());

        Lens lens1=new Lens(30,"Nikon",5000);
        System.out.println(lens1.toString());
        System.out.println("End the main in LensStarter");
    }
}
