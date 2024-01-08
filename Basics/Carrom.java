class Carrom{
	String color;
	double cost;
	String size;
	int noOfPan;
	String brand;
	
	Carrom(){
		this("White","Large","Queen",2,800);
		System.out.println("Without argument values...");
	}
	
	Carrom(String color){
	
		this.color=color;
		System.out.println("String is:"+color);
	}
	
	Carrom(String color,int noOfPan){
		this(color);
		this.noOfPan=noOfPan;
		System.out.println("int & String is:"+noOfPan+","+color);
	}
	
	Carrom(String color,int noOfPan,double cost){
		this(color,noOfPan);
		this.cost=cost;
		System.out.println("String,int & double is:"+color+","+noOfPan+","+cost);
		
	}
	
	Carrom(String color,String size,String brand,int noOfPan,double cost){
		this(color,noOfPan,cost);
		this.size=size;
		this.brand=brand;
		System.out.println("String,double,String & int is:"+color+","+cost+","+size+","+noOfPan+","+brand);
	}
	
}