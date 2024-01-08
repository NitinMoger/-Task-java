package com.Xworkz.InterfaceExampe;

public class Theater {
     TicketBooking ticketBooking;

    public Theater( TicketBooking ticketBooking)
    {
        this.ticketBooking=ticketBooking;
    }
    public double sell(int quantity)
    {

       // boolean cancle =ticketBooking.cancle();
        if(quantity==0){
            this.cancel();
            System.out.println("The information is null");
        }

        if(quantity>5)
        {
            int price=200;
            ticketBooking.buy(quantity);
            int totalprice=price*quantity;
            double discount=(quantity*price)/10;
            System.out.println("total price :"+totalprice);
            System.out.println("10% Discount for Ticket quantity is Greater then 5:"+discount);
        }
        else {
            int price=200;
            int totalprice=price*quantity;
            System.out.println("Quantity is less then 5:"+quantity);
            System.out.println("Total Price:"+totalprice);
        }

        return 5d;
    }

    public void cancel(){

        this.ticketBooking.cancle();
    }
}
