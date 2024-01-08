class Free{
    
    String timming;
    String location;
	String period;
	String course;
	long pincode;
	
	Free(String course,String period,String location,long pincode,String timming){
		this.course=course;
		this.period=period;
		this.location=location;
		this.pincode=pincode;
		this.timming=timming;
		System.out.println("The arguments are String,int,String,long,String....."+course+","+period+","+location+","+pincode+","+timming);
	}
	
	void displayInfo(){
        System.out.println("Free Course timming is: "+this.timming);
		System.out.println(" Free Course name is: "+this.course);
		System.out.println("Free Course period timming is: "+this.period);
		System.out.println("Free Course location is: "+this.location);
		System.out.println("Free Course pincode is: "+this.pincode);
		
	}
}