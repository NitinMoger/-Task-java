public class RocketStarter {
    
    public static void main(String[] args)
    {
        System.out.println("Start the Rockstarter in main");
        Rocket rocket=new Rocket();
        System.out.println("Name of the rocket:"+rocket.rocketName);
        System.out.println("lunching date of the rocket:"+rocket.launchDate);
        System.out.println("cost of the rocket:"+rocket.cost);
        System.out.println("Color of the rocket:"+rocket.color);
        
        Rocket rocket1=new Rocket("LVM3");
        System.out.println("Name of the rocket:"+rocket1.rocketName);
        System.out.println("lunching date of the rocket:"+rocket1.launchDate);
        System.out.println("cost of the rocket:"+rocket1.cost);
        System.out.println("Color of the rocket:"+rocket1.color);

        Rocket rocket2=new Rocket(2500);
        System.out.println("Name of the rocket:"+rocket2.rocketName);
        System.out.println("lunching date of the rocket:"+rocket2.launchDate);
        System.out.println("cost of the rocket:"+rocket2.cost);
        System.out.println("Color of the rocket:"+rocket2.color);

        Rocket rocket3=new Rocket(2300,"White");
        System.out.println("Name of the rocket:"+rocket3.rocketName);
        System.out.println("lunching date of the rocket:"+rocket3.launchDate);
        System.out.println("cost of the rocket:"+rocket3.cost);
        System.out.println("Color of the rocket:"+rocket3.color);

        Rocket rocket4=new Rocket("july/14//2023");
        System.out.println("Name of the rocket:"+rocket4.rocketName);
        System.out.println("lunching date of the rocket:"+rocket4.launchDate);
        System.out.println("cost of the rocket:"+rocket4.cost);
        System.out.println("Color of the rocket:"+rocket4.color);


        System.out.println("End the RockStarter in main");
    }
}
