public class Ornament {
    
    String materials;
    double cost;
    String Shape;
    int quantity;


    Ornament()
    {
        System.out.println("Construct having no arguments");
    }

    Ornament(String materials)
    {
        super();
        this.materials=materials;
        System.out.println("\nConstructor having a argument of materials:"+materials);
    }
    Ornament(double cost)
    {
        super();
        this.cost=cost;
        System.out.println("\nConstructor having a argument of cost:"+cost);
    }
    Ornament(String Shape, String materials)
    {
        super();
        this.Shape=Shape;
        this.materials=materials;
        System.out.println("\nConstructor having a argument of shape:"+Shape+ "," +materials);
    }
    Ornament(int quantity)
    {
        super();
        this.quantity=quantity;
        System.out.println("\nConstructor having a argument of quantity:"+quantity);
    }
    
}
