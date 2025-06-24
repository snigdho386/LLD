public class NearEntranceStrategy implements ParkingAllocationStrategy{

    @Override
    public ParkingSpot findParkingSpot(Level level, VehicleType vehicleType) {
        for(ParkingSpot parkingSpot: level.getParkingSpotList()){
            if(!parkingSpot.isOccupied && parkingSpot.vehicleType == vehicleType && parkingSpot.isNearEntrance()){
                return parkingSpot;
            }
        }
        return null;
    }
}
