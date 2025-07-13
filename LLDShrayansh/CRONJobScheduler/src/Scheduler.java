import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Scheduler {
    private static  Scheduler instance;
    private List<Command> commandList;
    private List<Observer> observerList;


    private Scheduler(){
        this.commandList = new ArrayList<>();
        this.observerList = new ArrayList<>();
    }

    public static Scheduler getSchedulerInstance(){
        if(instance==null){
            instance = new Scheduler();
        }

        return instance;
    }

    public void addCommand(Command command){
        commandList.add(command);
        System.out.println("Command is scheduled :: "+command.getCommandString());
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void notifyObservers(Command command){
        for(Observer obj: observerList){
            obj.update(command);
        }
    }

    public void start(){
        while(!commandList.isEmpty()){
            long currentTime = System.currentTimeMillis()/1000;
            Iterator<Command> itr = commandList.iterator();

            while(itr.hasNext()){
                Command currentCommand = itr.next();
                currentCommand.execute();
                notifyObservers(currentCommand);
                itr.remove();

            }
        }
    }
}
