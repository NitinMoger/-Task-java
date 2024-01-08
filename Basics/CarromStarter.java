class CarromStarter{
	
	public static void main(String[] args){
		System.out.println("Main start in Carrom Starter...");
		Carrom carrom=new Carrom();
		System.out.println("carrom color : "+carrom.color);
		System.out.println("carrom brand : "+carrom.brand);
        System.out.println("carrom cost : "+carrom.cost);
		System.out.println("carrom size : "+carrom.size);
		System.out.println("carrom noOfPan : "+carrom.noOfPan);
		System.out.println("___________________________________");
		
		Carrom carrom1=new Carrom("Red");
		System.out.println("carrom1 color : "+carrom1.color);
		System.out.println("carrom1 brand : "+carrom1.brand);
        System.out.println("carrom1 cost : "+carrom1.cost);
		System.out.println("carrom1 size : "+carrom1.size);
		System.out.println("carrom1 noOfPan : "+carrom1.noOfPan);
		System.out.println("___________________________________");
		
		Carrom carrom2=new Carrom("Yellow",8);
		System.out.println("carrom2 color : "+carrom2.color);
		System.out.println("carrom2 brand : "+carrom2.brand);
        System.out.println("carrom2 cost : "+carrom2.cost);
		System.out.println("carrom2 size : "+carrom2.size);
		System.out.println("carrom2 noOfPan : "+carrom2.noOfPan);
		System.out.println("___________________________________");
		
		Carrom carrom3=new Carrom("Golden",4,5500);
		System.out.println("carrom3 color : "+carrom3.color);
		System.out.println("carrom3 brand : "+carrom3.brand);
		System.out.println("carrom3 cost : "+carrom3.cost);
		System.out.println("carrom3 size : "+carrom3.size);
		System.out.println("carrom3 noOfPan : "+carrom3.noOfPan);
		System.out.println("___________________________________");
		
		Carrom carrom4=new Carrom("Orange","Small","Monster",3,3500);
		System.out.println("carrom4 color : "+carrom4.color);
		System.out.println("carrom4 brand : "+carrom4.brand);
        System.out.println("carrom4 cost : "+carrom4.cost);
		System.out.println("carrom4 size : "+carrom4.size);
		System.out.println("carrom4 noOfPan : "+carrom4.noOfPan);
		System.out.println("___________________________________");
		
		
		System.out.println("Main end in Carrom Starter...");
	
	}
}