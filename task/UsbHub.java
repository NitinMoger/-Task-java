package com.xworkz.task;

public class UsbHub {
    int totalPorts;

    double transferRate;

    int batteryRequired;

    public UsbHub(int totalPorts,double transferRate,int batteryRequired){
        this.totalPorts=totalPorts;
        this.transferRate=transferRate;
        this.batteryRequired=batteryRequired;
        System.out.println("Constructor having argument of int, double, int ");
    }

    @Override
    public boolean equals(Object obj) {

        UsbHub usbLeftSide=this;
        if(obj!=null){

            if(obj instanceof UsbHub) {
                UsbHub usbRightSide=(UsbHub)obj;

                System.out.println("same on both side");

                if (usbLeftSide.totalPorts == usbRightSide.totalPorts && usbLeftSide.transferRate == usbRightSide.transferRate && usbLeftSide.batteryRequired==usbRightSide.batteryRequired) {

                    System.out.println("usbRightSide and usbLightSide is same");
                    return true;
                }
                else
                {
                    System.err.println("usbRightSide and usbLightSide is not same");
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
