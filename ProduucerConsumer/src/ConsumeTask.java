public class ConsumeTask implements Runnable{
    SharedResource sharedResource;
    ConsumeTask(SharedResource resource){
        this.sharedResource = resource;
    }

    public void run(){
        System.out.println("Consumer thread running");
//        try{
//            Thread.sleep(5000);
//        } catch (Exception e) {
////            throw new RuntimeException(e);
//        }

        sharedResource.consumeItem();
    }
}
