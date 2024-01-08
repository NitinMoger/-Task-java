class Technology{

    long noOfTech;
    long noOfTechCompany;
    String efficiency;
    String usability;
	String techName;
    String instName;
	String impact;
	String fuctionality;
	double duration;
	double cost;
	String security;
	long technologists;
	
	
	Technology(long noOfTech,long noOfTechCompany,String efficiency,String techName,String instName,String usability,String impact,String fuctionality,double duration,long cost,String security,long technologists){
		
		this.instName=instName;
        this.noOfTechCompany=noOfTechCompany;
        this.efficiency=efficiency;
        this.noOfTech=noOfTech;
		this.usability=usability;
	    this.impact=impact;
		this.fuctionality=fuctionality;
		this.duration=duration;
        this.techName=techName;
		this.cost=cost;
		this.security=security;
		this.technologists=technologists;
		System.out.println("String,String,String,String,String,double,double,String,String,long,long & long ....."+techName+","+instName+","+usability+","+impact+","+fuctionality+","+duration+","+cost+","+efficiency+","+security+","+noOfTech+","+noOfTechCompany+","+technologists);
	}
	
	void displayInfo(){
		System.out.println("Technology name: "+this.techName);
		System.out.println("Institute name: "+this.instName);
		System.out.println("Useability : "+this.usability);
		System.out.println("impact: "+this.impact);
		System.out.println("fuctionality: "+this.fuctionality);
		System.out.println("duration : "+this.duration);
		System.out.println("Technology cost: "+this.cost);
		System.out.println("Technology efficiency: "+this.efficiency);
		System.out.println("Technology security: "+this.security);
		System.out.println(" noOfTech: "+this.noOfTech);
		System.out.println("noOfTechCompany: "+this.noOfTechCompany);
		System.out.println("technologists: "+this.technologists);
	}

}