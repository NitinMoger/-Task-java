class GameStarter {
    public static void main(String[] args) {
        Game chess = new Game(1, "Carrom", TotalPlayers.TWO);
        Player player1 = new Player("Nitin", chess);
        Player player2 = new Player("Vishu", chess);

        player1.play();
        player2.play();

        player1.pauseGame();
        player2.endGame();

        player1.showInfo();
        player2.showInfo();
    }
}