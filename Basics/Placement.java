class Placement{

	int noOfHR;
	int noOfCandidate;
	int noOfRounds;
	int noOfvacancy;
	int batch;
	String compName;
	String candName;
	String qualification;
	int age;
	String interviewDate;
	String timing;
	String document;
	
	Placement(int noOfHR,int noOfCandidate,int noOfRounds,int noOfvacancy,String compName,String candName,int batch,String qualification,int age,String interviewDate,String timing,String document){
		this.noOfHR=noOfHR;
		this.noOfCandidate=noOfCandidate;
		this.noOfRounds=noOfRounds;
		this.noOfvacancy=noOfvacancy;
		this.compName=compName;
		this.candName=candName;
		this.batch=batch;
		this.qualification=qualification;
		this.age=age;
		this.interviewDate=interviewDate;
		this.timing=timing;
		this.document=document;
		System.out.println("String,String,int,int,String,int,String,int,int,int,String & String....."+noOfHR+","+noOfCandidate+","+compName+","+candName+","+batch+","+noOfvacancy+","+qualification+","+age+","+interviewDate+","+noOfRounds+","+timing+","+document);
	}
	
	void displayInfo(){
		System.out.println("noOfHR: "+this.noOfHR);
		System.out.println("noOfCandidate: "+this.noOfCandidate);
		System.out.println("noOfRounds: "+this.noOfRounds);
		System.out.println("Company name: "+this.compName);
		System.out.println("Candidate name: "+this.candName);
		System.out.println("Cand batch: "+this.batch);
		System.out.println("noOfvacancy: "+this.noOfvacancy);
		System.out.println("candidate qualification: "+this.qualification);
		System.out.println("Candidate age: "+this.age);
		System.out.println("Interview date: "+this.interviewDate);
		System.out.println("Interview timing: "+this.timing);
		System.out.println("candidate document: "+this.document);
	}
}