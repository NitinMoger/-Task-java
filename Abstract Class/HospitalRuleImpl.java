package com.xworkz.Instructor;

public class HospitalRuleImpl implements HospitalRule {

    @Override
    public boolean wearMask() {
        System.out.println("Run the wearMask");
        return false;
    }

    @Override
    public void dont_Horn() {
        System.out.println("Run the Dont Horn");
    }

    @Override
    public void wash_Your_hands() {
        System.out.println("Hospital Name:"+name);
        System.out.println("Hospital TotalStaffs:"+total_staffs);
        System.out.println("Run the Wash your hands");
    }

    @Override
    public void dont_Smoke() {
        System.out.println("Run the dont Smoke");
    }
}
