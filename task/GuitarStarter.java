package com.xworkz.task;

public class GuitarStarter {
    public static void main(String[] args) {
        System.out.println("Starting main method in GiutarStarter");

        Guitar guitar = new Guitar(6, 5000, "Gibson Brand");
        Guitar guitar1 = new Guitar(6, 5000, "Gibson Brand");
        boolean same = guitar.equals(guitar1);
        System.out.println("guitar.equals(guitar1):" + same);
        System.out.println("==========================================");

        WifiDongle wifiDongle=new WifiDongle("Jio",200,30);
        WifiDongle wifiDongle1=new WifiDongle("Jio",200,30);
        boolean same1=wifiDongle.equals(wifiDongle1);
        System.out.println("wifiDongle.equals(wifiDongle1):"+same1);
        System.out.println("==========================================");


        UsbHub usbHub=new UsbHub(4,5,0);
        UsbHub usbHub1=new UsbHub(4,5,0);
        boolean same2=usbHub.equals(usbHub1);
        System.out.println("usbhub.equals(usbhub1):"+same2);
        System.out.println("==========================================");


        System.out.println("Ending main method in GiutarStarter");


    }

    }
