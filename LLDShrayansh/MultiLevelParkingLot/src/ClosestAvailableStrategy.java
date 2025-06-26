public class ClosestAvailableStrategy implements ParkingAllocationStrategy {
    @Override
    public ParkingSpot findParkingSpot(Level level, VehicleType vehicleType) {
        for (ParkingSpot parkingSpot: level.getParkingSpotList()){
            if(!parkingSpot.isOccupied && parkingSpot.vehicleType== vehicleType)
                    return parkingSpot;
        }

        return null;
    }
}
