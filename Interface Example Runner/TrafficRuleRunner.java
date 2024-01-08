package com.Xworkz.boot;

import com.Xworkz.InterfaceExampe.TrafficController;
import com.Xworkz.InterfaceExampe.TrafficRule;
import com.Xworkz.InterfaceExampe.TrafficRuleImpl;

public class TrafficRuleRunner {

    public static void main(String[] args) {
        System.out.println("Start the main method in TrafficRuleRunner");
        TrafficRule trafficRule=new TrafficRuleImpl(); //implemntation
        TrafficController trafficController=new TrafficController(trafficRule);
        trafficRule.helmet_wear();
        trafficRule.signal_time();
        trafficRule.signals();//abstraction
        System.out.println("End the main method in TrafficRuleRunner");
    }
}
