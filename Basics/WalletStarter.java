public class WalletStarter {
    
    public static void main(String[] args)
    {
        System.out.println("Start the WalletStarter in main");
        Wallet wallet=new Wallet();
        System.out.println("The NAme of the Walet is:"+wallet.name);
        System.out.println("The cost of the Walet is:"+wallet.cost);
        System.out.println("The color of the Walet is:"+wallet.color);
        System.out.println("The Number of compartments of the Wallet is:"+wallet.numberOfCompartments);

        Wallet wallet1=new Wallet("Mohit");
        System.out.println("The NAme of the Walet is:"+wallet1.name);
        System.out.println("The cost of the Walet is:"+wallet1.cost);
        System.out.println("The color of the Walet is:"+wallet1.color);
        System.out.println("The Number of compartments of the Wallet is:"+wallet1.numberOfCompartments);

        Wallet wallet2=new Wallet("Red",5,250);
        System.out.println("The NAme of the Walet is:"+wallet2.name);
        System.out.println("The cost of the Walet is:"+wallet2.cost);
        System.out.println("The color of the Walet is:"+wallet2.color);
        System.out.println("The Number of compartments of the Wallet is:"+wallet2.numberOfCompartments);

        Wallet wallet3=new Wallet("Bharat",5);
        System.out.println("The NAme of the Walet is:"+wallet3.name);
        System.out.println("The cost of the Walet is:"+wallet3.cost);
        System.out.println("The color of the Walet is:"+wallet3.color);
        System.out.println("The Number of compartments of the Wallet is:"+wallet3.numberOfCompartments);

        Wallet wallet4=new Wallet(4,150);
        System.out.println("The NAme of the Walet is:"+wallet4.name);
        System.out.println("The cost of the Walet is:"+wallet4.cost);
        System.out.println("The color of the Walet is:"+wallet4.color);
        System.out.println("The Number of compartments of the Wallet is:"+wallet4.numberOfCompartments);
        
        System.out.println("End the Walllet Starter in main");
    }
}
