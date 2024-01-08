class Remote 
{
	usedFor usedfor;
	int totalButtons;
	boolean original;
	
	Remote()
	{
		System.out.println("no argument constructor of remote");
	}
	
	Remote(usedFor usedfor,int totalButtons,boolean original)
	{
		this.usedfor=usedfor;
		this.totalButtons=totalButtons;
		this.original=original;
		System.out.println("Remote usedfor:"+this.usedfor);
		System.out.println("Remote totalButtons:"+this.totalButtons);
		System.out.println("Remote original:"+this.original);
	}
	void on()
	{
		System.out.println("Run the on method in Remote class");
	}
	void off()
	{
		System.out.println("Run the off method in Remote class");
	}
	void increaseVolume()
	{
		System.out.println("Run the increaseVolume method in Remote class");
	}
	void decreaseVolume()
	{
		System.out.println("Run the decreaseVolume method in Remote class");
	}
	void changeChannel()
	{
		System.out.println("Run the changeChannel method in Remote class");
	}
}