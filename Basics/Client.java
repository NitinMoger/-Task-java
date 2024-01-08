public class Client {
    static String purchaseProduct(String clientName,String product,int quantity)
    {
    boolean purchase=Amazon.onlinePurchase(clientName, product, quantity);
    System.out.println("Starting the purchase product");
    if(purchase==true)
    {
    return "successfully purchased product";
    }
    else
    {
    return "The purchase product is failed";
    }
}
    }

