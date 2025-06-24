public class ExecutionLog implements Observer{
    @Override
    public void update(Command command) {

        System.out.println("Command ready for execution: "+ command.getCommandString()+" at "+command.getExecutionTime());
    }
}
