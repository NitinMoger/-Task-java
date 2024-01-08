class Helmet{
	String brand;
	double cost;
	String metal;
	int quantity;
	String size;
	
	Helmet(){
		this("sports",1,500,"Fiber","Small");
		System.out.println("Without orgument values...");
	}
	
	Helmet(String brand){
	
		this.brand=brand;
		System.out.println("String is:"+brand);
	}
	
	Helmet(String brand,int quantity){
		this(brand);
		this.quantity=quantity;
		System.out.println("String & int is:"+quantity+","+brand);
	}
	
	Helmet(String brand,int quantity,double cost){
		this(brand,quantity);
		this.cost=cost;
		System.out.println("String,int & double is:"+brand+","+quantity+","+cost);
		
	}
	
	Helmet(String brand,int quantity,double cost,String metal,String size){
		this(brand,quantity,cost);
		this.metal=metal;
		this.size=size;
		System.out.println("String,int,double,String&String is:"+brand+","+cost+","+metal+","+quantity+","+size);
	}
	
}