public class XWonState implements GameState{

    @Override
    public void next(GameContext gameContext, HumanPlayer player, boolean hasWon) {

        //Game over
        return;
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}
