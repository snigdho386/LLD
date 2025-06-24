import java.util.List;
import java.util.UUID;

public class ParkingLot {
    public List<Level> levelList;

    public ParkingLot(List<Level>levelList){
        this.levelList = levelList;
    }

    public Ticket parkVehicle(Vehicle vehicle, ParkingAllocationStrategy strategy,long entryTime){
        for(Level level: this.levelList){
            ParkingSpot spot = strategy.findParkingSpot(level,vehicle.vehicleType);
            if(spot!=null){
                spot.setOccupied(true);
                return new Ticket(UUID.randomUUID().toString(),entryTime,vehicle,spot);
            }
        }

        return null;
    }

    public double ExitVehicle(Ticket ticket,long exitTime){
        long duration = exitTime - ticket.entryTime;
        double fare = calcFare(duration);
        ticket.parkingSpot.setOccupied(false);
        return fare;
    }

    double calcFare(double duration){
        System.out.println("Charge for :: "+duration+" time = "+60.00);
        return 60.00;
    }


}
