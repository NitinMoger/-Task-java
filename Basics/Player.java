class Player 
{
    String name;
    Game game;

    public Player(String name, Game game)
	{
        this.name = name;
        this.game = game;
    }

    public void play() 
	{
        game.originPlay();
        System.out.println( "game is playing by :"+name);
    }

    public void pauseGame() 
	{
        game.pause();
        System.out.println("game was paused by :"+name  );
    }

    public void endGame() {
        game.end();
        System.out.println("game was ended by :"+name);
    }

    public void showInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Player's Game: " + game);
    }
}
