public class ProduceTask implements Runnable{
    SharedResource sharedResource;
    ProduceTask(SharedResource resource){
        this.sharedResource = resource;
    }

    public void run(){
        System.out.println("Producer thread running");
        try{
            Thread.sleep(5000);
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }

        sharedResource.addItem();
    }
}
