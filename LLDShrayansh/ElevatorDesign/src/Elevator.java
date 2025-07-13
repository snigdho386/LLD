import java.util.Map;
import java.util.PriorityQueue;

class FloorRequestType{

    boolean upRequest,downRequest;


    public void setUpRequest(boolean upRequest){
        this.upRequest = upRequest;
    }

    public void setDownRequest(boolean downRequest){
        this.downRequest = downRequest;
    }
}
public class Elevator {
    int currentFloor;
    Direction direction;
    PriorityQueue<Request>upQueue,downQueue;
    Map<Integer,FloorRequestType> mp;

    public Elevator(int currentFloor){
        this.currentFloor = currentFloor;
        direction = Direction.IDLE;
        this.upQueue = new PriorityQueue<>((a,b)->a.destinationFloor-b.destinationFloor);
        this.downQueue= new PriorityQueue<>((a,b)->b.destinationFloor-a.destinationFloor);
    }

    public void sendUpRequest(Request upRequest){
        if(upRequest.location==Location.OUTSIDE_ELEVATOR){
            upQueue.add(new Request(upRequest.currentFloor,upRequest.currentFloor,Direction.UP,Location.OUTSIDE_ELEVATOR));
            System.out.println("Append up request going to floor "+upRequest.currentFloor);
        }
        upQueue.add(upRequest);
        System.out.println("Append up request going to floor "+upRequest.currentFloor);
    }

    public void sendDown(Request downRequest){
        if(downRequest.location==Location.OUTSIDE_ELEVATOR){
            downQueue.add(new Request(downRequest.currentFloor,downRequest.currentFloor,Direction.DOWN,Location.OUTSIDE_ELEVATOR));
            System.out.println("Append down request going to floor "+downRequest.currentFloor);
        }
        downQueue.add(downRequest);
        System.out.println("Append down request going to floor "+downRequest.currentFloor);
    }

    public void run(){
        while(!upQueue.isEmpty() || !downQueue.isEmpty())
            processRequests();
        System.out.println("Processed all requests!");
        direction = Direction.IDLE;
    }

    public void processRequests(){
        if(direction==Direction.UP || direction==Direction.IDLE){
            processUpRequests();
            processDownRequests();
        }else{
            processDownRequests();
            processUpRequests();
        }
    }

    public void processUpRequests(){
        while(!upQueue.isEmpty()){
            Request currentRequest = upQueue.poll();
            currentFloor = currentRequest.destinationFloor;
            System.out.println("Elevator is at :: "+currentFloor);
        }
        if(!downQueue.isEmpty())
        {
            direction = Direction.DOWN;
        }else{
            direction = Direction.IDLE;
        }
    }

    public void processDownRequests(){
        while(!downQueue.isEmpty()){
            Request currentRequest = downQueue.poll();
            currentFloor = currentRequest.destinationFloor;
            System.out.println("Elevator is at :: "+currentFloor);
        }
        if(!upQueue.isEmpty())
        {
            direction = Direction.DOWN;
        }else{
            direction = Direction.IDLE;
        }
    }

}
