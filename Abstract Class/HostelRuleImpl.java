package com.xworkz.Instructor;

import java.sql.SQLOutput;

public class HostelRuleImpl implements HostelRule{

    @Override
    public void hostel_closing_time() {
        System.out.println("Total Rooms:"+totalRooms);
        System.out.println("TotalBath Rooms:"+total_Bathrooms);
        System.out.println("Run the Hostel closing time");
    }

    @Override
    public void hostel_Timming_For_Food() {
        System.out.println("Run the hostel Timming for Food");
    }

    @Override
    public void alchol_and_Smoking_notAllowed() {
        System.out.println("run the alchol_and_Smoking_notAllowed");
    }

    @Override
    public void study_Timmings() {
        System.out.println("Run the study Timmings");
    }


}
