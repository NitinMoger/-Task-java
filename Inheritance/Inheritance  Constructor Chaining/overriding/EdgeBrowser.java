class EdgeBrowser extends Browser
{
	EdgeBrowser()
	{
		System.out.println("no argument constructor of EdgeBrowser");
		this.run();
		this.stop();
		this.execute();
		this.collectInfo();
		this.displayInfo();
		this.consumerMemory();
		this.consumeInternet();
		
	}
	@Override
	void run()
	{
		
		System.out.println("Run the run in EdgeBrowser");	
	}
	
	@Override
	void stop()
	{
		System.out.println("Run the stop in EdgeBrowser");
	}
	
	@Override
	void execute()
	{
		System.out.println("Run the execute in EdgeBrowser");
	}
	
	@Override
	void collectInfo()
	{
		System.out.println("Run the collectInfo in EdgeBrowser");
	}
	
	@Override
	void displayInfo()
	{
		System.out.println("Run the displayInfo in EdgeBrowser");
	}
	
	@Override
	void consumerMemory()
	{
		System.out.println("Run the consumerMemory in EdgeBrowser");
	}
	
	@Override
	void consumeInternet()
	{
		System.out.println("Run the consumeInternet in EdgeBrowser");
	}
	
	@Override
	void settings(String[] downloads)
	{
		this.downloads=downloads;
		System.out.println("Downloads using Browser:"+this.downloads);
		for(int i=0;i<downloads.length;i++)
		{
		 System.out.println("Downloads are:"+i+" "+this.downloads[i]);
		}
		System.out.println("Run the settings in EdgeBrowser");
	}
	
	@Override
	void displayHistory(String[] browsingHistorySites)
	{
		this.browsingHistorySites=browsingHistorySites;
		System.out.println("browsingHistorySites using Browser:"+this.browsingHistorySites);
		for(int index1=0;index1<browsingHistorySites.length;index1++)
		{
		   System.out.println("Downloads are:"+index1+" "+this.browsingHistorySites[index1]);
		}
		System.out.println("Run the displayHistory in EdgeBrowser");
	}
}