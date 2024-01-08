package com.xworkz.electronics.washingMachine;

import com.xworkz.electonics.mobile.Realme;

class Lg extends Realme {

    private void wash()
    {
        System.out.println("run the wash in Lg");
    }
    @Override
    protected void realme()
    {
        this.wash();
        System.out.println("Run the realme in lg");
    }
    void dry()
    {
        System.out.println("run the dry method in realme");
    }

}
