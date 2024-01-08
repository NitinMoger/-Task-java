class Owner{
	
	String name;
	Address permanantAddress;
	Address temporaryAddress;
	
	Owner(){
		System.out.println("created Owner using no arg const");
	}
	
	void setPermanantAddress(Address permanantAddress){
		
		this.permanantAddress=permanantAddress;
	}
	
	void setTemporaryAddress(Address temporaryAddress){
		this.temporaryAddress=temporaryAddress;
	}
	
	void show(){
		
		System.out.println("Starting show in Owner");
		System.out.println("Owner name is "+this.name);
		System.out.println("Owner name is "+this.permanantAddress);
		if(permanantAddress!=null)
		{
			
			permanantAddress.show();
		}
		System.out.println("Owner name is "+this.temporaryAddress);
		if(temporaryAddress!=null)
		{
			
			temporaryAddress.show();
		}
		System.out.println("Starting show in Owner");
	}
}