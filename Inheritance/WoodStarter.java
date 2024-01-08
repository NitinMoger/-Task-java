class WoodStarter
{
	public static void main(String... args)
	{
		System.out.println("Start the main in Woodstarter");
		
		Wood wood=new Bat();
		wood.Design();
	    
		Bat bat1=(Bat)wood;
		bat1.Play();
		bat1.Design();
		
		System.out.println("End the main in woodStarter");
	}
}