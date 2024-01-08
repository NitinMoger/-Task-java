public class Rocket {
    

    String rocketName;
    String launchDate;
    double cost;
    String color;


    Rocket()
    {
        System.out.println("Constructor With No Argument");
    }

    Rocket(String rocketName)
    {
        super();
        this.rocketName=rocketName;
        System.out.println("\nConstructor having argument name of rocketName:"+rocketName);
    }

    Rocket(double cost)
    {
        super();
        this.cost=cost;
        System.out.println("\nConstructor having argument name of cost:"+cost);
    }

    Rocket(double cost,String color)
    {
        super();
        this.cost=cost;
        this.color=color;
        System.out.println("\nConstructor having argument name of cost and color:"+cost+ "," +color);
    }

    Rocket(String launchDate,String rocketName)
    {
        super();
        this.launchDate=launchDate;
        this.rocketName=rocketName;
        System.out.println("\nConstructor having argument name of cost and color:"+launchDate+ "," +rocketName);
    }
}
