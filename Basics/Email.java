class Email{
  String domain;
  int id;
  String fname;
  String lastName;
  
  
  Email(String domain,int id,String fname,String lastName)
  {
	  this.domain=domain;
	  this.id=id;
	  this.fname=fname;
	  this.lastName=lastName;
	  
  }
  void showInfo()
  {
	  System.out.println("Starting the Email");
	  System.out.println("Email domain is:"+this.domain);
	  System.out.println("Email id:"+this.id);
	  System.out.println("Email fname:"+this.fname);
	  System.out.println("Email lastName:"+this.lastName);
	  System.out.println("Ending the Email");
  }

}