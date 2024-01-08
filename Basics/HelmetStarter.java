class HelmetStarter{
	
	public static void main(String[] args){
		System.out.println("Main start in helmet starter...");
		Helmet helmet=new Helmet();
		System.out.println("helmet brand : "+helmet.brand);
		System.out.println("helmet size : "+helmet.size);
        System.out.println("helmet cost : "+helmet.cost);
		System.out.println("helmet metal : "+helmet.metal);
		System.out.println("helmet quantity : "+helmet.quantity);
		System.out.println("___________________________________");
		
		Helmet helmet1=new Helmet("Sports");
		System.out.println("helmet1 brand : "+helmet1.brand);
		System.out.println("helmet1 size : "+helmet1.size);
        System.out.println("helmet1 cost : "+helmet1.cost);
		System.out.println("helmet1 metal : "+helmet1.metal);
		System.out.println("helmet1 quantity : "+helmet1.quantity);
		System.out.println("___________________________________");
		
		Helmet helmet2=new Helmet("sports",1);
		System.out.println("helmet2 brand : "+helmet2.brand);
		System.out.println("helmet2 size : "+helmet2.size);
        System.out.println("helmet2 cost : "+helmet2.cost);
		System.out.println("helmet2 metal : "+helmet2.metal);
		System.out.println("helmet2 quantity : "+helmet2.quantity);
		System.out.println("___________________________________");
		
		Helmet helmet3=new Helmet("sports",1,500);
		System.out.println("helmet3 brand : "+helmet3.brand);
		System.out.println("helmet3 size : "+helmet3.size);
        System.out.println("helmet3 cost : "+helmet3.cost);
		System.out.println("helmet3 metal : "+helmet3.metal);
		System.out.println("helmet3 quantity : "+helmet3.quantity);
		System.out.println("___________________________________");
		
		Helmet helmet4=new Helmet("sports",1,500,"Iron","Medium");
		System.out.println("helmet4 brand : "+helmet4.brand);
		System.out.println("helmet4 size : "+helmet4.size);
        System.out.println("helmet4 cost : "+helmet4.cost);
		System.out.println("helmet4 metal : "+helmet4.metal);
		System.out.println("helmet4 quantity : "+helmet4.quantity);
		System.out.println("___________________________________");
		

		System.out.println("Main end in helmet starter...");
	
	}
}