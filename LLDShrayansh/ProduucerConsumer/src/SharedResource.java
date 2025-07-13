public class SharedResource {
    boolean itemAvailable = false;

    //Synchronized put the monitor lock
    public synchronized  void addItem(){
        itemAvailable = true;
        System.out.println("Item added");
        notifyAll();
        //Notified all threads
    }

    public synchronized void consumeItem(){
        System.out.println("Item is inside consumed block");

        while(!itemAvailable){
            try{
                System.out.println("Wating to consume");
                wait();
            } catch (Exception e) {
//                throw new RuntimeException(e);
            }
        }

        System.out.println("Item is consumed");
        itemAvailable = false;
    }
}
