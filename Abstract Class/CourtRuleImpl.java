package com.xworkz.Instructor;

public class CourtRuleImpl implements CourtRule{

    @Override
    public void plant_to_Arrive_Early() {
        System.out.println("Run the plant_to_Arrive_Early");
    }

    @Override
    public void weapons_are_prohibited() {
        System.out.println("Run the weapons_are_prohibited");
    }

    @Override
    public void leave_childrens_at_home() {
        System.out.println("Run the leave_childrens_at_home");
    }

    @Override
    public void do_not_eat() {
        System.out.println("Run the do_not_eat");
    }
}
