package com.Xworkz.boot;

import com.Xworkz.Laptop.LaptopRunner.*;

public class ProductRunner {
    public static void main(String[] args) {
        System.out.println("Start the main in ProductRunner");
        DeliveryRule ref=new RuleImpl();
        ref.damaged();
        ref.packed();

        SellerRule ref1=new RuleImpl();
        ref1.deliveryCharges();
        ref1.replacement();

        RuleImpl ref2=new RuleImpl();
        ref2.damaged();
        ref2.packed();
        ref2.deliveryCharges();
        ref2.replacement();
        System.out.println("=============================");

        System.out.println("Start the CitizenRuleImpl");
        CitizenRuleImpl ref3=new CitizenRuleImpl();
        ref3.validLicense();
        ref3.signalJump();;
        ref3.nri();
        ref3.marksCard();
        ref3.voterId();

        CitizenRule ref4=(CitizenRule)ref3; //convert the ref3 to citizenRule//
        ref4.voterId();
        ref4.nri();
        ref4.marksCard();
        ref4.signalJump();
        ref4.validLicense();
        System.out.println("End the CitizenRuleImpl");

        Object obj=(Object)ref3;


        System.out.println("End the main in ProductRunner");
    }
}
