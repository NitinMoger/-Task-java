class Keyboard {
    
    String brand="Casio";
    String color;
    int noOfKeys;
    String type="Ergonomic keyboard";
    double cost=700;


    Keyboard()
    {
        System.out.println("No arguments in the constructor");
    }

    Keyboard(String color)
    {
        this.color=color;
        System.out.println("\nConstructor with arguments as" +color);
    }
    Keyboard(String color, String type)
    {
        this.color=color;
        this.type=type;
        System.out.println("\nConstructor with arguments as-" +color+ "," +type);
    }
    Keyboard(double cost,String brand, int noOfKeys)
    {
        this.cost=cost;
        this.brand=brand;
        this.noOfKeys=noOfKeys;
        System.out.println("\nConstructor with arguments as-" +cost+ "," +brand+ "," +noOfKeys);
    }
    Keyboard(double cost, int noOfKeys)
    {
        this.cost=cost;
        this.noOfKeys=noOfKeys;
        System.out.println("\nConstructor with arguments as " +cost+ "," +noOfKeys);
    }
    Keyboard(double cost,String brand, int noOfKeys,String type, String color)
    {
        this.cost=cost;
        this.brand=brand;
        this.noOfKeys=noOfKeys;
        this.color=color;
        this.type=type;
        System.out.println("\nConstructor with arguments as-" +cost+ " , " +brand+ " , " +noOfKeys+ " , " +color+ " and " +type);
    }
}
