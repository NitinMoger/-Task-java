package com.Xworkz.InterfaceExampe;

public class TrafficRuleImpl implements TrafficRule{


    @Override
    public boolean signals() {
        System.out.println("Follow the signals");
        return true;
    }

    @Override
    public int signal_time() {
        System.out.println("Follow The Signal_time");
        return 40;
    }

    @Override
    public boolean helmet_wear() {
        System.out.println("Follow the helmet_wear");
        return true;
    }
}
