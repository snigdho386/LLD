public class TV {

    private Command currentrCommand;

    public void setCurrentCommand(Command command) {
        currentrCommand = command;
    }

    public void play() {
        currentrCommand.execute();
    }
}
