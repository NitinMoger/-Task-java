class Canteen{

	String type;
	String[] utensils;

	Canteen(String type)
	{
        this.type=type;   
		System.out.println("Created Canteen with no argument constructor");
	}

	void setUtensils(String[] utensils){

		this.utensils=utensils;
	}

	void showInfo(){

		System.out.println("Starting displayInfo in Canteen");
		System.out.println("Canteen type is "+this.type);
		System.out.println("Canteen utensils are "+this.utensils);
		if(this.utensils!=null){
		for(int seq=0;seq<this.utensils.length;seq++){

			String ref=this.utensils[seq];
			System.out.println("utensils are "+this.utensils[seq]+" at the seq "+seq);
		}
		}
		System.out.println("Ending displayInfo in Canteen");
	}
}