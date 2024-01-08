class PlantStarter
{
	public static void main(String... health)
	{
		System.out.println("STart the PlantStarter in main");
		
		Plant plant=new Foods();
		plant.Reproduction();
		
		Foods food=(Foods)plant;
		food.Chilly();
		food.Reproduction();
		
		System.out.println("End the PlantStarter in main");
	}
	
}