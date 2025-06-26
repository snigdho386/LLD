import java.util.List;

public class Level {
    public int levelNumber;
    public List<ParkingSpot> parkingSpotList;

    public Level(int levelNumber,List<ParkingSpot>parkingSpotList){
        this.levelNumber = levelNumber;
        this.parkingSpotList = parkingSpotList;
    }

    public List<ParkingSpot> getParkingSpotList(){
        return parkingSpotList;
    }
}
