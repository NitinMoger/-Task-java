package com.xworkz.Instructor;

public class ForestRuleImpl implements ForestRule {

    @Override
    public void dont_use_plastic() {
        System.out.println("Forest Name:"+name);
        System.out.println("Forest Location:"+location);
        System.out.println("Run the dont_use_plastic ");
    }

    @Override
    public void no_alcholoic_Beverage() {
        System.out.println("Run the no_alcholoic_Beverage");
    }

    @Override
    public void no_hunting() {
        System.out.println("run the no_hunting");
    }

    @Override
    public void no_Loud_audio() {
        System.out.println("Run the no_Loud_audio");
    }
}
