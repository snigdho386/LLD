public class HumanPlayer implements PlayerStrategy {

    Symbol symbol;
    String name;

    public HumanPlayer(
           Symbol symbol,
           String name
    ){
        this.symbol = symbol;
        this.name = name;
    }

    @Override
    public void makeMove(Position position) {

    }
}
