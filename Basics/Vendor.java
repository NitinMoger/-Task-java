public class Vendor {
    static int billProduct(String product, int quantity)
    {
        int discount=Manufacture.getDiscount(product,quantity);
        int price;
        if(product=="Tv"&&quantity>10)
        {
            price=2000*quantity;
        }
        else if(product=="Fridge" && quantity>20)
        {
            price=25000*quantity;
        }
        else if(product=="Owen" && quantity>30)
        {
            price=50000*quantity;
        }
        else if(product=="Mobile" && quantity>30)
        {
            price=7500*quantity;
        }
        else if(product=="Toaster" && quantity>30)
        {
            price=1000*quantity;
        }
        else{
            System.out.println("Discount not applied for:"+product);
            return 0;
        }
        int finalPrice=price-(price*discount/100);
        System.out.println("Discount for-"+quantity+ product+ "-is-" +finalPrice);
        System.out.println("total price of product without discount:" +price);
        return finalPrice;
        
    }
}
