public class MonitorLockExample {
    public synchronized  void task1(){
        try{
            System.out.println("Inside task 1");
            Thread.sleep(10000);
        } catch (Exception e) {
            //throw new RuntimeException(e);
        }
    }

    public void task2(){
        System.out.println("Task 2 before synchronized");
        synchronized (this){
            System.out.println("Task 2 inside synnchronized");
        }
    }

    public void task3(){
        System.out.println("Task 3");
    }

}
