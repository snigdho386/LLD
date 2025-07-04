

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();
        Thread t1 = new Thread(()-> {
            obj.task1();
        });
        Thread t2 = new Thread(()-> {
            obj.task2();
        });
        Thread t3 = new Thread(()-> {
            obj.task3();
        });

        t1.start();
        t2.start();
        t3.start();

    }
}