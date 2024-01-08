class Course{
    
    String period;
    String location;
    long pincode;
    int noOfStudents;
    String instituteName;
	String course;
	double timing;
    String trainerName;
	
	
	Course(String instituteName,String course,String period,String location,long pincode,double timing,int noOfStudents,String trainerName){
		this.period=period;
        this.location=location;
        this.pincode=pincode;
        this.instituteName=instituteName;
		this.course=course;
		this.timing=timing;
		this.noOfStudents=noOfStudents;
        this.trainerName=trainerName;
		System.out.println("String,int,String,long,double,String....."+instituteName+","+course+","+period+","+location+","+pincode+","+timing+","+noOfStudents+","+trainerName);
	}
	
	void displayInfo(){
        System.out.println("Course period time is: "+this.period);
        System.out.println("Course  location is: "+this.location);
		System.out.println(" instituteName :"+this.instituteName);
		System.out.println("Course name is: "+this.course);
		System.out.println("Course pincode is: "+this.pincode);
		System.out.println("Course timing is: "+this.timing);
        System.out.println("Trainer name is: "+this.trainerName);
		System.out.println("total number of student in Course is: "+this.noOfStudents);
	}
}