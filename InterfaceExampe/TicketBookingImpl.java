package com.Xworkz.InterfaceExampe;

public class TicketBookingImpl implements TicketBooking{

    @Override
    public double buy(int quantity) {
        System.out.println("Booked succesfully with quantity:"+quantity);
        return 5;
    }

    @Override
    public boolean cancle() {
        System.out.println("booking canceled");
        return true;
    }
}
