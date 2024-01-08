package com.xworkz.Instructor;

public abstract class HostelRunner {

    public static void main(String[] args) {
        System.out.println("Start the main in HostelRuner");
        HostelRuleImpl ref= new HostelRuleImpl();
        ref.hostel_closing_time();
        ref.hostel_Timming_For_Food();
        ref.alchol_and_Smoking_notAllowed();
        ref.study_Timmings();
        System.out.println("========================================");

        System.out.println("Start The HospitalRunner");
        HospitalRuleImpl ref1=new HospitalRuleImpl();
        ref1.dont_Horn();
        ref1.dont_Smoke();
        ref1.wash_Your_hands();
        ref1.wearMask();
        System.out.println("========================================");

        System.out.println("Start the CourtRule");
        CourtRuleImpl ref3=new CourtRuleImpl() ;
        ref3.do_not_eat();
        ref3.leave_childrens_at_home();
        ref3.plant_to_Arrive_Early();
        ref3.weapons_are_prohibited();
        System.out.println("=========================================");

        System.out.println("Start the ForestRule");
        ForestRuleImpl ref4=new ForestRuleImpl();
        ref4.dont_use_plastic();
        ref4.no_alcholoic_Beverage();
        ref4.no_hunting();
        ref4.no_Loud_audio();
        System.out.println("==========================================");

        System.out.println("Start the TempleRule");
        TempleRuleImpl ref5=new TempleRuleImpl() ;
        ref5.remove_footwear();
        ref5.remove_your_shirts();
        ref5.switchoff_mobile();
        ref5.walk_clockwise();
        System.out.println("===========================================");
        System.out.println("End the main in HostelRunner");
    }
}
