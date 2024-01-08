package com.Xworkz.InterfaceExampe;

public class TrafficController {

    private TrafficRule trafficRule;

    public TrafficController(TrafficRule trafficRule)
    {
        this.trafficRule=trafficRule;
    }

    public void policeOfficer() {
        boolean signal = trafficRule.signals();
        int signal_time=trafficRule.signal_time();
        boolean helmet_wearing = trafficRule.helmet_wear();
        if (signal && helmet_wearing && signal_time!=0)
        {
            System.out.println("Traffic signal is having a some information");
        }
        else
        {
            System.out.println("Traffic signal is not having any information");
        }

    }
}
