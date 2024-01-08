class RestaurantStarter
{
	public static void main(String[] items)
	{
		System.out.println("STart the main method in Resturant starter");
	     
		 String[] val=new String[5];
         val[0]="Idli";
         val[1]="Dosa";
         val[2]="Vada";
         val[3]="Masala Dosa";
         val[4]="Palav";
       	Restaurant myRestaurant=new Restaurant("jayadev");
        myRestaurant.setSpecialItems(val);
		myRestaurant.showInfo();
		
		System.out.println("Ending the main method in Resturant starter");
	}
}