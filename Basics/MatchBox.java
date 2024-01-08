public class MatchBox {
    String brand="Asia match";
    int noOfStick=10;
    double length;
    double price=5;
    String size;
    int weight;
    String type="Divine match box";

    MatchBox()
    {
        System.out.println("No arguments in constructor");
    }
    MatchBox(String brand)
    {
        this.brand=brand;
        System.out.println("Constructor with arguments as " +brand);
    }
    MatchBox(int weight, int noOfStick)
    {
        this.weight=weight;
        this.noOfStick=noOfStick;
        System.out.println("\nConstructor with arguments as " +weight+ " , " +noOfStick);
    }
    MatchBox(String size, String type)
    {
        this.size=size;
        this.type=type;
        System.out.println("\nConstructor with arguments as " +size+ " , " +type);
    }
    MatchBox(String brand, double price,int weight)
    {
        this.brand=brand;
        this.weight=weight;
        this.price=price;
        System.out.println("\nConstructor with arguments as " +brand+ " , " +weight+ " , " +price);
    }
    MatchBox(int noOfStick, String type, double length)
    {
        this.noOfStick=noOfStick;
        this.type=type;
        this.length=length;
        System.out.println("\nConstructor with arguments as " +noOfStick+ " , " +type+ " and " +length);
    }
    MatchBox(String brand, int noOfStick)
    {
        this.brand=brand;
        this.noOfStick=noOfStick;
        System.out.println("\nConstructor with arguments as " +brand+ " , " +noOfStick);
    }


}
