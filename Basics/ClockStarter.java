public class ClockStarter {
    
    public static void main(String[] args)
    {
        System.out.println("Start the Clock Starter in main");
        Clock clock=new Clock();
        System.out.println("Price of the Clock:"+clock.price);
        System.out.println("Color of the Clock:"+clock.color);
        System.out.println("Brand of the Clock:"+clock.brand);
        System.out.println("Type of the Clock:"+clock.type);
        
        Clock clock1=new Clock("Red");
        System.out.println("Price of the Clock:"+clock1.price);
        System.out.println("Color of the Clock:"+clock1.color);
        System.out.println("Brand of the Clock:"+clock1.brand);
        System.out.println("Type of the Clock:"+clock1.type);

        Clock clock2=new Clock("Smart Watch","Bolt");
        System.out.println("Price of the Clock:"+clock2.price);
        System.out.println("Color of the Clock:"+clock2.color);
        System.out.println("Brand of the Clock:"+clock2.brand);
        System.out.println("Type of the Clock:"+clock2.type);

        Clock clock3=new Clock(2500);
        System.out.println("Price of the Clock:"+clock3.price);
        System.out.println("Color of the Clock:"+clock3.color);
        System.out.println("Brand of the Clock:"+clock3.brand);
        System.out.println("Type of the Clock:"+clock3.type);

        Clock clock4=new Clock("Diving Watch",1800);
        System.out.println("Price of the Clock:"+clock4.price);
        System.out.println("Color of the Clock:"+clock4.color);
        System.out.println("Brand of the Clock:"+clock4.brand);
        System.out.println("Type of the Clock:"+clock4.type);

        System.out.println("End the clock starter in main");
    }
}
