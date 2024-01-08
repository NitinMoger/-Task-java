package com.Xworkz.boot;
import com.Xworkz.InterfaceExampe.Light;

public class LightRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Light light=new Light("Red","TubeLight",250,2);
        Light light1=(Light)light.clone();
        Light light2=(Light)light.clone();
        Light light3=(Light)light.clone();
        Light light4=(Light)light.clone();
        System.out.println(light1);
        System.out.println(light2);
        System.out.println(light3);
        System.out.println(light4);

    }
}
