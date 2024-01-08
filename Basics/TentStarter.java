class TentStarter{

public static void main(String[] args)
{
	
	System.out.println("Starting the Main in Tent starter");
	    Tent tent1 = new Tent(1, 5.0, 3.0, Color.RED);

        // Create an Agent
        Agent agent1 = new Agent(101, "John Doe", "Camping Co.");

        // Show Tent and Agent Info
        tent1.showInfo();
        agent1.showInfo();

        // Agent opens and closes the tent
        agent1.openTent(tent1);
        agent1.closeTent(tent1);

        // Show Tent Info after interaction
        tent1.showInfo();
		
	
	System.out.println("Ending the main in TentStarter");
	
}
}