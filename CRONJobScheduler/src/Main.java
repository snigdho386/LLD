import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scheduler scheduler = Scheduler.getSchedulerInstance();

        scheduler.addObserver(new CommandExecutor());
        scheduler.addObserver(new ExecutionLog());

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter command :: ");
            String commandString = sc.nextLine();
            if(commandString.equals("exit")){
                break;
            }

            System.out.println("Eneter execcution time in epoch :: ");
            long executionTime = sc.nextLong();

            sc.nextLine();
            Command command = new Command(executionTime,commandString);
            scheduler.addCommand(command);
        }

        System.out.println("Starting scheduler :: ");
        scheduler.start();
    }
}