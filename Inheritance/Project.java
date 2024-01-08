class Project
{
	Project()
	{
		System.out.println("no argmt con... in Project");
	}
	void validate(Person person)
	{
		System.out.println("Start the validation in Project");
		if(person!=null)
		{
		Person person1=new Person();
		person1.eat();
		person1.sleep();
		
		if(person1 instanceof Developer)
		  {
			
		    Developer develop=(Developer)person;
		    develop.code();
		    develop.sleep();
		    develop.eat();
		  }
		  if(person instanceof Tester)
		  {
			  Tester test=(Tester)person;
			  test.qualityCheck();
			  test.code();
		  
			}
			if(person instanceof DatabaseDeveloper){
				DatabaseDeveloper databasedeveloper = (DatabaseDeveloper)person;
				databasedeveloper.eat();
				databasedeveloper.sleep();
				databasedeveloper.runScripts();
			}
			if(person instanceof ProductOwner){
				ProductOwner productowner=(ProductOwner)person;
				productowner.eat();
				productowner.sleep();
				productowner.validate();
		   }
		   if(person instanceof BusinessAnalyst){
				BusinessAnalyst businessAnalyst=(BusinessAnalyst)person;
				businessAnalyst.eat();
				businessAnalyst.sleep();
				businessAnalyst.checkRequirements();
		   }
		   if(person instanceof Devops){
				Devops devops=(Devops)person;
				devops.eat();
				devops.sleep();
				devops.runBuild();
		   }
	    }
	   System.out.println("End the validation in project");	
	}
}