package com.xworkz.task;

public class Guitar {

    int id;
    double price;
    String material;

    public Guitar(int id, double price, String material) {
        this.id = id;
        this.price = price;
        this.material = material;
        System.out.println("Constructor with int,double,String Arguments");
    }

    @Override
    public boolean equals(Object obj) {

        Guitar leftSide = this;
        if (obj != null) {

            if (obj instanceof Guitar) {
                Guitar guitarRightSide = (Guitar) obj;

                System.out.println("same on both side");

                if (leftSide.id == guitarRightSide.id && leftSide.price == guitarRightSide.price) {

                    System.out.println("leftside and guitarrightside is same");
                    return true;
                }
                else
                {
                    System.err.println("leftside and guitarrightside is not same");
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

