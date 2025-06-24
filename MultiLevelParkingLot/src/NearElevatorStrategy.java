public class NearElevatorStrategy implements ParkingAllocationStrategy{
    @Override
    public ParkingSpot findParkingSpot(Level level, VehicleType vehicleType) {
        for(ParkingSpot parkingSpot: level.getParkingSpotList()){
            if(!parkingSpot.isOccupied && parkingSpot.vehicleType==vehicleType && parkingSpot.isNearElevator())
                return parkingSpot;
        }
        return null;
    }
}
