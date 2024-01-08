package com.xworkz.Instructor;

public class TempleRuleImpl implements TempleRule {

    @Override
    public boolean walk_clockwise() {
        System.out.println("Run the walk_clockwise");
        return false;
    }

    @Override
    public void remove_footwear() {
        System.out.println("Run the remove_footwear");
    }

    @Override
    public void remove_your_shirts() {

        System.out.println("Temple Name:"+name);
        System.out.println("Loaction:"+location);
        System.out.println("Run the remove_your_shirts");
    }

    @Override
    public void switchoff_mobile() {
        System.out.println("Run the switchoff_mobile");
    }
}
