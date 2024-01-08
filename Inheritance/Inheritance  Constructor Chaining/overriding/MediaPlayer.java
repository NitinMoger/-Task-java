class MediaPlayer extends StandaloneApplication
{
	String[] favourites;
	MediaPlayer()
	{
		System.out.println("no argument constructor of MediaPlayer");
	}
	void play()
	{
		System.out.println("Run the play in Mediaplayer");
	}
	void delete(String[] favourites)
	{
		System.out.println("Run the Delete in Mediaplayer");
		this.favourites=favourites;
		System.out.println("Array start:"+this.favourites);
		for(int index=0;index<favourites.length;index++)
		{
			System.out.println("The favourites are:"+index+" "+this.favourites[index]);
		}
	}
	void download()
	{
		System.out.println("Run the download in Mediaplayer");
	}
}