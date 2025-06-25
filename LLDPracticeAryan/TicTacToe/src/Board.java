public class Board {

    HumanPlayer currentPlayer;
    Symbol[][] grid;

    public Board(
    HumanPlayer currentPlayer,
    int boardSize
    ){
        setCurrentPlayer(currentPlayer);
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    public void makeMove(Position position){
        grid[position.X][position.Y] = currentPlayer.symbol;
    }

    public boolean isValidMove(){return false;}

    public void checkGameState(GameContext gameContext, HumanPlayer nextPlayer){

        if(isWinning(gameContext)){
            gameContext.next(currentPlayer,true);
            return;
        }

        gameContext.next(currentPlayer,false);
        return;
    }

    private boolean isWinning(GameContext gameContext){
        return false;

    }

    public void setCurrentPlayer(HumanPlayer player){
        currentPlayer = player;
    }

}
