class FirefoxBrowser extends Browser
{
	FirefoxBrowser()
	{
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
		
		System.out.println("Run the run in ChromeBrowser");	
	}
	
	@Override
	void stop()
	{
		System.out.println("Run the stop in ChromeBrowser");
	}
	
	@Override
	void execute()
	{
		System.out.println("Run the execute in ChromeBrowser");
	}
	
	@Override
	void collectInfo()
	{
		System.out.println("Run the collectInfo in ChromeBrowser");
	}
	
	@Override
	void displayInfo()
	{
		System.out.println("Run the displayInfo in ChromeBrowser");
	}
	
	@Override
	void consumerMemory()
	{
		System.out.println("Run the consumerMemory in ChromeBrowser");
	}
	
	@Override
	void consumeInternet()
	{
		System.out.println("Run the consumeInternet in ChromeBrowser");
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
		System.out.println("Run the settings in ChromeBrowser");
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
		System.out.println("Run the displayHistory in ChromeBrowser");
	}
	
}