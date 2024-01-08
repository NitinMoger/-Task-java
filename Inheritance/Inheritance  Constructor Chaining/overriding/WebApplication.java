class WebApplication extends Application 
{
	boolean free;
	String[] supportedBrowsers;
	WebApplication()
	{
		System.out.println("no argument constructor of WebApplication");
	}
	
	WebApplication(boolean free)
	{
		this.free=free;
		System.out.println("WebApplication is free:"+this.free);
	}
	void connectInternet(String[] supportedBrowsers)
	{
		System.out.println("Run the connectInternet in WebApplication");
		this.supportedBrowsers=supportedBrowsers;
		System.out.println("Array start:"+this.supportedBrowsers);
		for(int index=0;index<supportedBrowsers.length;index++)
		{
			System.out.println("The supportedBrowsers are:"+index+" "+this.supportedBrowsers[index]);
		}
		
		
	}
	void sendUsage()
	{
		System.out.println("Run the sendUsage in WebApplication");
	}
	
}