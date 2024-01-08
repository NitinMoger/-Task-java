class MakeupKit{
	String brand;
	double cost;
	String experyDate;
	int noOfItem;
	
	MakeupKit(){
		super();
		System.out.println("default values..");
	}
	
	MakeupKit(String brand){
		super();
		this.brand=brand;
		System.out.println("brand name : "+brand);
	}
	
	MakeupKit(double cost){
		super();
		this.cost=cost;
		System.out.println("cost is:"+cost);
	}
	
	MakeupKit(String experyDate,int noOfItem){
		super();
		this.experyDate=experyDate;
		this.noOfItem=noOfItem;
		System.out.println("experyDate : "+experyDate);
		System.out.println("noOfItem  : "+noOfItem);
	}
	
	MakeupKit(String brand,double cost,String experyDate,int noOfItem){
		super();
		this.brand=brand;
		this.cost=cost;
		this.experyDate=experyDate;
		this.noOfItem=noOfItem;
		System.out.println("brand name : "+brand);
		System.out.println("cost is:"+cost);
		System.out.println("experyDate : "+experyDate);
		System.out.println("noOfItem  : "+noOfItem);
	}
}