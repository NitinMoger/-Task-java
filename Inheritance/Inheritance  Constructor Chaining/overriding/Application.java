class Application
{
	
	int id;
	Type type;
	String version;
	String developer;
	String date;
	
	
	Application()
	{
		System.out.println("no argument constructor for Application");
	}
	Application(int id,Type type,String version,String developer,String date)
	{
		this.id=id;
		this.type=type;
		this.version=version;
		this.developer=developer;
		this.date=date;
		
		System.out.println("The Application Id:"+this.id);
		System.out.println("The Application Type:"+this.type);
		System.out.println("The Application Version:"+this.version);
		System.out.println("The Application Developer:"+this.developer);
		System.out.println("The Application Date:"+this.date);
		System.out.println("no argument constructor for Application");
		
	}
	void run()
	{
		
		System.out.println("Run the run in Application");	
	}
	void stop()
	{
		System.out.println("Run the stop in Application");
	}
	void execute()
	{
		System.out.println("Run the execute in Application");
	}
	void collectInfo()
	{
		System.out.println("Run the collectInfo in Application");
	}
	void displayInfo()
	{
		System.out.println("Run the displayInfo in Application");
	}
}