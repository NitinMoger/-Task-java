class StandaloneApplication extends Application
{
	double size;
	double compatibleWidth;
	
	StandaloneApplication()
	{
		System.out.println("no argument constructor of StandaloneApplication");
	}
	StandaloneApplication(int id,Type type,String version,String developer,String date,double size,double compatibleWidth)
	{
		super(id,type,version,developer,date);
		this.size=size;
		this.compatibleWidth=compatibleWidth;
		System.out.println("Size of the standaloneApplication:"+this.size);
		System.out.println("Width of the standaloneApplication:"+this.compatibleWidth);
	}
	void consumerMemory()
	{
		System.out.println("Run the consumerMemory in standaloneApplication");
	}
	void consumeInternet()
	{
		System.out.println("Run the consumeInternet in standaloneApplication");
	}
}