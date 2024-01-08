class Restaurant
{
	String ownerName;
	String[] specialItems;
	
	
	Restaurant(String ownerName)
	{
		System.out.println("Create the restuarnt using String argument construct");
		this.ownerName=ownerName;
		
	}
	void setSpecialItems(String[] specialItems)
	{
		this.specialItems=specialItems;
	}
	
	void showInfo()
	{
		System.out.println("Start the showInfo method");
		System.out.println("The ownerName is:"+this.ownerName);
		System.out.println("The special Items:"+this.specialItems);
		if(this.specialItems!=null)
		{
			for(int index=0;index<this.specialItems.length;index++)
			{
				String ref=this.specialItems[index];
				System.out.println("The special Items:"+this.specialItems[index]);
			}
		}
		
		System.out.println("End the showinfo method");
	}
		
		
		
	
}