// Game class
class Game {
    int id;
    String name;
    TotalPlayers totalPlayers;

    public Game(int id, String name, TotalPlayers totalPlayers) 
	{
        this.id = id;
        this.name = name;
        this.totalPlayers = totalPlayers;
    }

    public void originPlay() 
	{
        System.out.println("Game Was  Started:"+name);
    }

    public void pause() 
	{
        System.out.println("Game is paused by:"+name);
    }

    public void end() 
	{
        System.out.println("Game has Ended by:"+name);
    }

    public void showInfo()
	{
        System.out.println("Game ID: " + id);
        System.out.println("Game Name: " + name);
        System.out.println("Total Players: " + totalPlayers);
    }
}
