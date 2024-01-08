package com.xworkz.task;

public class WifiDongle {
    String brand;
    double transferRate;
    int itemWeight;

    public WifiDongle(String brand,double transferRate,int itemWeight){
        this.brand=brand;
        this.transferRate=transferRate;
        this.itemWeight=itemWeight;
        System.out.println("constructor having argument of String, double,int");
    }

    @Override
    public boolean equals(Object obj) {

        WifiDongle wifiLeftSide=this;
        if(obj!=null){

            if(obj instanceof WifiDongle) {
                WifiDongle wifiRightSide=(WifiDongle)obj;

                System.out.println("same on both side");

                if (wifiLeftSide.transferRate == wifiRightSide.transferRate && wifiLeftSide.itemWeight == wifiRightSide.itemWeight) {

                    System.out.println("wifileftside and wifirightside is same");
                    return true;
                }
                else
                {
                    System.err.println("wifileftside and wifirightside is not same");
                }
            }
        }
        else
        {
            System.err.println("The value is null");
        }

        return false;
}

}

