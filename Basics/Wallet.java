public class Wallet {
    
    String name;
    double cost;
    String color;
    int numberOfCompartments;

    Wallet()
    {
        System.out.println("constructor Having No arguments");
    }

    Wallet(String name)
    {
        super();
        this.name=name;
        System.out.println("\nConstructor is having a Argument of name:"+name);
    }

    Wallet(String color, int numberOfCompartments, double cost)
    {
        super();
        this.color=color;
        this.numberOfCompartments=numberOfCompartments;
        this.cost=cost;
        System.out.println("\nConstructor is having a Argument of color and numberOfCompartments,cost:"+color+ "," +numberOfCompartments+ "," +cost);
    }

    Wallet(String name,int numberOfCompartments)
    {
        super();
        this.name=name;
        this.numberOfCompartments=numberOfCompartments;
        System.out.println("\nConstructor is having a Argument of name and number of compartments:"+name+ "," +numberOfCompartments);
    }

    Wallet(int numberOfCompartments, double cost)
    {
        super();
        this.numberOfCompartments=numberOfCompartments;
        this.cost=cost;
        System.out.println("\nnumber of compartments and cost are the arguments of the  construct:"+numberOfCompartments+ "," +cost);
    }
}
