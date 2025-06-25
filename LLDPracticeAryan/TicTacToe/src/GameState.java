public interface GameState {


    public void next(GameContext gameContext, HumanPlayer player, boolean hasWon);
    public boolean isGameOver();
}
