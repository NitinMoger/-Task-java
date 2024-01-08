public class BraceletStarter {


    public static void main(String[] args)
    {
        System.out.println("Starting the bracelet in main");
        Bracelet bracelet=new Bracelet();
        System.out.println("The name of the braclete:"+bracelet.name);
        System.out.println("The Shape of the braclete:"+bracelet.shape);
        System.out.println("The cost of the braclete:"+bracelet.cost);
        System.out.println("The weight of the braclete:"+bracelet.weight);
        System.out.println("The purity of the braclete:"+bracelet.purity);
        System.out.println("Ending the bracelet in main");

        Bracelet bracelet1=new Bracelet("rajat","short",23);
        System.out.println("The name of the braclete:"+bracelet1.name);
        System.out.println("The Shape of the braclete:"+bracelet1.shape);
        System.out.println("The cost of the braclete:"+bracelet1.cost);
        System.out.println("The weight of the braclete:"+bracelet1.weight);
        System.out.println("The purity of the braclete:"+bracelet1.purity);
        System.out.println("Ending the bracelet in main");

        Bracelet bracelet2=new Bracelet("Shambhu","Circle",32000,21);
        System.out.println("The name of the braclete:"+bracelet2.name);
        System.out.println("The Shape of the braclete:"+bracelet2.shape);
        System.out.println("The cost of the braclete:"+bracelet2.cost);
        System.out.println("The weight of the braclete:"+bracelet2.weight);
        System.out.println("The purity of the braclete:"+bracelet2.purity);
        System.out.println("Ending the bracelet in main");

        Bracelet bracelet3=new Bracelet("Sharat","Box",38000,21);
        System.out.println("The name of the braclete:"+bracelet3.name);
        System.out.println("The Shape of the braclete:"+bracelet3.shape);
        System.out.println("The cost of the braclete:"+bracelet3.cost);
        System.out.println("The weight of the braclete:"+bracelet3.weight);
        System.out.println("The purity of the braclete:"+bracelet3.purity);
        System.out.println("Ending the bracelet in main");

        Bracelet bracelet4=new Bracelet("Shambhu","Circle",32000,21,"22karat");
        System.out.println("The name of the braclete:"+bracelet4.name);
        System.out.println("The Shape of the braclete:"+bracelet4.shape);
        System.out.println("The cost of the braclete:"+bracelet4.cost);
        System.out.println("The weight of the braclete:"+bracelet4.weight);
        System.out.println("The purity of the braclete:"+bracelet4.purity);
        System.out.println("Ending the bracelet in main");
    }
    
}
