public class OWonState implements GameState{


    @Override
    public void next(GameContext gameContext, HumanPlayer player, boolean hasWon) {
        //GameOver
        return;
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}
