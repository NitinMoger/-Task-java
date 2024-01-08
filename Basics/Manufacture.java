public class Manufacture{
  static int getDiscount(String product,int quantity)
    {
        System.out.println("The manufacture is Started");
      if(product=="Tv" && quantity>10)
      {
        return 5;
      }
      if(product=="Fridge" && quantity>20)
      {
        return 10;
      }
      if(product=="Owen" || product=="Mobile" && quantity>30)
      {
        return 15;
      }
      return 0;
    }
}