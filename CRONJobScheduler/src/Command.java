import java.util.UUID;

public  class Command {
    public String commandId;
    public String commandString;
    public long executionTime;

    public Command(long executionTime,String commandString){
        this.commandId = UUID.randomUUID().toString();
        this.commandString = commandString;
        this.executionTime = executionTime;
    }

    public String getCommandId(){
        return this.commandId;
    }

    public String getCommandString(){
        return this.commandString;
    }

    public long getExecutionTime(){
        return this.executionTime;
    }

    public void execute(){
        try{
            Thread.sleep(1000);
            System.out.println("Command "+this.commandString+" got executed successfully ");
        } catch (InterruptedException e) {
            System.out.println("Command execution failed");
            throw new RuntimeException(e);
        }
    }
}
