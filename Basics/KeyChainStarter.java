public class KeyChainStarter {
    
    public static void main(String[] args)
    {
        System.out.println("Starting the KeyChain in main");
        KeyChain KeyChain=new KeyChain();
        System.out.println("The style of the key chain:"+KeyChain.style);
        System.out.println("The Shape of the key chain:"+KeyChain.shape);
        System.out.println("The cost of the key chain:"+KeyChain.cost);
        System.out.println("The weight of the key chain:"+KeyChain.weight);
        System.out.println("The color of the key chain:"+KeyChain.color);
        System.out.println("Ending the KeyChain in main");

        KeyChain KeyChain1=new KeyChain("Door","short",20);
        System.out.println("The style of the key chain:"+KeyChain1.style);
        System.out.println("The Shape of the key chain:"+KeyChain1.shape);
        System.out.println("The cost of the key chain:"+KeyChain1.cost);
        System.out.println("The weight of the key chain:"+KeyChain1.weight);
        System.out.println("The color of the key chain:"+KeyChain1.color);
        System.out.println("Ending the KeyChain in main");

        KeyChain KeyChain2=new KeyChain("Cycle","Circle",35,21);
        System.out.println("The style of the key chain:"+KeyChain2.style);
        System.out.println("The Shape of the key chain:"+KeyChain2.shape);
        System.out.println("The cost of the key chain:"+KeyChain2.cost);
        System.out.println("The weight of the key chain:"+KeyChain2.weight);
        System.out.println("The color of the key chain:"+KeyChain2.color);
        System.out.println("Ending the KeyChain in main");

        KeyChain KeyChain3=new KeyChain("Window","Box",100,21);
        System.out.println("The style of the key chain:"+KeyChain3.style);
        System.out.println("The Shape of the key chain:"+KeyChain3.shape);
        System.out.println("The cost of the key chain:"+KeyChain3.cost);
        System.out.println("The weight of the key chain:"+KeyChain3.weight);
        System.out.println("The color of the key chain:"+KeyChain3.color);
        System.out.println("Ending the KeyChain in main");

        KeyChain KeyChain4=new KeyChain("Shambhu","Circle",200,21,"22karat");
        System.out.println("The style of the key chain:"+KeyChain4.style);
        System.out.println("The Shape of the key chain:"+KeyChain4.shape);
        System.out.println("The cost of the key chain:"+KeyChain4.cost);
        System.out.println("The weight of the key chain:"+KeyChain4.weight);
        System.out.println("The color of the key chain:"+KeyChain4.color);
        System.out.println("Ending the KeyChain in main");
    }
}
