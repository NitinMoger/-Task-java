class PersonStarter
{
	public static void main(String... args)
	{
		System.out.println("Start the main in Person Starter");
		Project project=new Project();
		Person person=new Person();
		project.validate(person);
		
		Developer developer=new Developer();
		project.validate(developer);
		
		Tester tester=new Tester();
		project.validate(tester);
		
		DatabaseDeveloper databasedeveloper=new DatabaseDeveloper();
		project.validate(databasedeveloper);
		
		ProductOwner productowner=new ProductOwner();
		project.validate(productowner);
		
		BusinessAnalyst businessAnalyst=new BusinessAnalyst();
		project.validate(businessAnalyst);
		
		Devops devops=new Devops();
		project.validate(devops);
		
		
		System.out.println("End the main in PersonStarter");
	}
}