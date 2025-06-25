public class GameContext {

    private GameState currentState;

    public GameContext(){
        currentState = new XTurnState();
    }

    public void setState(GameState gameState){
        currentState = gameState;
    }

    public void next(HumanPlayer player, boolean hasWon){
        currentState.next(this,player,hasWon);
    }

    public boolean isGameOver(){
        return currentState.isGameOver();
    }

    public GameState getCurrentState() {
        return currentState;
    }
}
