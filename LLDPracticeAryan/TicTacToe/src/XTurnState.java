public class XTurnState implements GameState{


    @Override
    public void next(GameContext gameContext, HumanPlayer player, boolean hasWon) {

        if(hasWon){
            gameContext.setState((player.symbol==Symbol.X)?new XWonState():new OWonState());
        }

        gameContext.setState(new OTurnState());
    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}
