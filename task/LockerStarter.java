package com.xworkz.task;

public class LockerStarter {

    public static void main(String[] args) {

        System.out.println("Start the main method in LockerStarter");
         Locker locker=new Locker(50,"Gray","Sensor");
         System.out.println(locker.tostring());

        Locker locker1=new Locker(100,"Gold","Manual");
        System.out.println(locker1.tostring());
        System.out.println("========================================");

        Cotton cotton=new Cotton(250,12,"Red");
        System.out.println(cotton.tostring());

        Cotton cotton1=new Cotton(550,10,"Green");
        System.out.println(cotton1.tostring());
        System.out.println("========================================");

        Mic mic=new Mic(100,0,300);
        System.out.println(mic.tostring());

        Mic mic1=new Mic(100,0,300);
        System.out.println(mic1.tostring());
        System.out.println("========================================");

        Heart heart=new Heart("Shambhu","Red","Normal");
        System.out.println(heart.tostring());

        Heart heart1=new Heart("Rohit","Red","High");
        System.out.println(heart1.tostring());
        System.out.println("========================================");

        Chain chain=new Chain("Gold",15000,"LockSystem");
        System.out.println(chain.tostring());

        Chain chain1=new Chain("Silver",10000,"Normal");
        System.out.println(chain1.tostring());
        System.out.println("========================================");

        Rice rice=new Rice("Basmathi",1000,"1st quality");
        System.out.println(rice.tostring());

        Rice rice1=new Rice("White rice",500,"2nd quality");
        System.out.println(rice1.tostring());
        System.out.println("========================================");

        Bucket bucket=new Bucket(150,"Cera",250);
        System.out.println(bucket.tostring());

        Bucket bucket1=new Bucket(250,"Jai",350);
        System.out.println(bucket1.tostring());
        System.out.println("========================================");

        Bowl bowl=new Bowl(50,"King",250);
        System.out.println(bowl.tostring());

        Bowl bowl1=new Bowl(100,"kohli",350);
        System.out.println(bowl1.tostring());
        System.out.println("========================================");

        Spoon spoon=new Spoon(50,"Santoor",250);
        System.out.println(spoon.tostring());

        Spoon spoon1=new Spoon(100,"Jagwar",350);
        System.out.println(spoon1.tostring());
        System.out.println("========================================");

        Geycer geycer=new Geycer(50,"Butterfly",25000);
        System.out.println(geycer.tostring());

        Geycer geycer1=new Geycer(20,"Jagwar",15000);
        System.out.println(geycer1.tostring());
        System.out.println("========================================");

        Money money=new Money("India","Rupees","Coin");
        System.out.println(money.tostring());
        Money money1=new Money("America","Dollars","Coin");
        System.out.println(money1.tostring());

        System.out.println("End the main method in LockerStarter");
    }
}
