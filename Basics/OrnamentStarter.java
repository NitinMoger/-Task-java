public class OrnamentStarter {
    public static void main(String[] args)
    {
        System.out.println("Start the ornamentStarter in main");
        Ornament ornament=new Ornament();
        System.out.println("Materials of ornament:"+ornament.materials);
        System.out.println("Cost of ornament:"+ornament.cost);
        System.out.println("Shape of ornament:"+ornament.Shape);
        System.out.println("Quantity of ornament:"+ornament.quantity);

        Ornament ornament1=new Ornament("paper");
        System.out.println("Materials of ornament:"+ornament1.materials);
        System.out.println("Cost of ornament:"+ornament1.cost);
        System.out.println("Shape of ornament:"+ornament1.Shape);
        System.out.println("Quantity of ornament:"+ornament1.quantity);

        Ornament ornament2=new Ornament(20);
        System.out.println("Materials of ornament:"+ornament2.materials);
        System.out.println("Cost of ornament:"+ornament2.cost);
        System.out.println("Shape of ornament:"+ornament2.Shape);
        System.out.println("Quantity of ornament:"+ornament2.quantity);

        Ornament ornament3=new Ornament("Circle","Metal");
        System.out.println("Materials of ornament:"+ornament3.materials);
        System.out.println("Cost of ornament:"+ornament3.cost);
        System.out.println("Shape of ornament:"+ornament3.Shape);
        System.out.println("Quantity of ornament:"+ornament3.quantity);

        Ornament ornament4=new Ornament(3);
        System.out.println("Materials of ornament:"+ornament4.materials);
        System.out.println("Cost of ornament:"+ornament4.cost);
        System.out.println("Shape of ornament:"+ornament4.Shape);
        System.out.println("Quantity of ornament:"+ornament4.quantity);

        System.out.println("ENd the ornament starter in main");
    }
}
