
public class Request {
    int currentFloor;
    int destinationFloor;
    Direction dir;
    Location location;

    public Request(int currentFloor,int destinationFloor,Direction dir,Location location){
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        this.dir = dir;
        this.location = location;
    }
}
