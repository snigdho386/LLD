public class OTurnState implements GameState {


    @Override
    public void next(GameContext gameContext, HumanPlayer player, boolean hasWon) {
        if(hasWon){
            gameContext.setState((player.symbol==Symbol.X)?new XWonState():new OWonState());
        }

        gameContext.setState(new XTurnState());
    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}
