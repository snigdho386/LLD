public interface ParkingAllocationStrategy {
    public ParkingSpot findParkingSpot(Level level, VehicleType vehicleType);
}
