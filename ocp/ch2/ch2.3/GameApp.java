class GameApp {
	Game game = null;

	public void startGame() {
		game = new Game();
		game.gameLevel = Level.BEGINNER;
	}
}
