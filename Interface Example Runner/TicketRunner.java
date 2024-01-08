package com.Xworkz.boot;
import com.Xworkz.InterfaceExampe.Ticket;
public class TicketRunner {
    public static void main(String[] args) throws CloneNotSupportedException {

        Ticket ticket=new Ticket(5,"Katera",250,"Gopalan Cinemas");
        Ticket ticket1=(Ticket) ticket.clone();
        Ticket ticket2=(Ticket) ticket.clone();
        Ticket ticket3=(Ticket) ticket.clone();
        Ticket ticket4=(Ticket) ticket.clone();
        System.out.println(ticket1);
        System.out.println(ticket2);
        System.out.println(ticket3);
        System.out.println(ticket4);
    }
}
