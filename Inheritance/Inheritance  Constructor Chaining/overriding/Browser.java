class Browser extends StandaloneApplication
{
	String[] downloads;
	String[] browsingHistorySites;
	
	
	Browser()
	{
		System.out.println("no argument constructor of Browser");
	}
	
	void settings(String[] downloads)
	{
		this.downloads=downloads;
		System.out.println("Downloads using Browser:"+this.downloads);
		for(int i=0;i<downloads.length;i++)
		{
		 System.out.println("Downloads are:"+i+" "+this.downloads[i]);
		}
		System.out.println("Run the settings in Browser");
	}
	
	void displayHistory(String[] browsingHistorySites)
	{
		this.browsingHistorySites=browsingHistorySites;
		System.out.println("browsingHistorySites using Browser:"+this.browsingHistorySites);
		for(int index1=0;index1<browsingHistorySites.length;index1++)
		{
		   System.out.println("Downloads are:"+index1+" "+this.browsingHistorySites[index1]);
		}
		System.out.println("Run the displayHistory in Browser");
	}
}