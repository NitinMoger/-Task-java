package com.Xworkz.boot;

import com.Xworkz.InterfaceExampe.Theater;
import com.Xworkz.InterfaceExampe.TicketBooking;
import com.Xworkz.InterfaceExampe.TicketBookingImpl;

public class TicketBookingRunner {
    public static void main(String[] args) {
        System.out.println("Start the main method in TicketBookingRunner");
        TicketBooking ticketBooking=new TicketBookingImpl();
        Theater theater=new Theater(ticketBooking);
        theater.sell(0);

        System.out.println("End the main method in TicketBookingRunner");
    }
}
