public class Clock {
    
    double price;
    String color;
    String brand;
    String type;

    Clock()
    {
        System.out.println("constructor Having no Arguments");
    }

    Clock(String color)
    {
        super();
        this.color=color;
        System.out.println("color is argument of the constructor:"+color);
    }
    Clock(String type,String brand)
    {
        super();
        this.type=type;
        this.brand=brand;
        System.out.println("type and brand is the argument of the constructor:"+type+ "," +brand);
    }
    Clock(double price)
    {
        super();
        this.price=price;
        System.out.println("price is the argument of the constructor:"+price);
    }
    Clock(String type,double price)
    {
        super();
        this.type=type;
        this.price=price;
        System.out.println("type and brand is the argument of the constructor:"+type+ "," +price);
    }
}

    

