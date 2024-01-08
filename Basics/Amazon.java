public class Amazon {
    static boolean onlinePurchase(String clientName,String product,int quantity)
    {
        System.out.println("The Online purchase in Amazone");
        int value= Vendor.billProduct(product,quantity);
        if(clientName=="Divya"|| clientName=="Shambhu"|| clientName=="Nitin" ||clientName=="Geeta" ||clientName=="Mufidha")
        {
            System.out.println("The client Name is:"+clientName);
            System.out.println("The discounted price is:" +value);
            System.out.println("Product Name is:"+product);
            return true;
        }
        else{
        System.out.println("Charges applied for Delivery");
        return false;
        }
    }
}
