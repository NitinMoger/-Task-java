package com.xworkz.Ruler.multiple;

public class Laptop {
    private DataCable dataCable=new DataCableImpl();

    public Laptop(DataCable dataCable)
    {
        this.dataCable=dataCable;
        System.out.println("Run the Laptop with data cable constructor");
    }
    void laptopConnect(){
        System.out.println("LaptopConnect Method running");
        if(dataCable!=null){
            this.dataCable.transferData();
            this.dataCable.connectToPort();

        }
        else {
            System.out.println("Not connected");
        }

    }
}
