public class CommandExecutor implements Observer {
    @Override
    public void update(Command command) {
        System.out.println("Executing command :: "+ command.getCommandString());
    }
}
