public class ParkingSpot {

    public int spotId;
    public VehicleType vehicleType;
    public boolean isOccupied;
    public boolean isNearElevator;
    public boolean isNearEntrance;

    public ParkingSpot(int spotId,VehicleType vehicleType,boolean isNearElevator, boolean isNearEntrance){
        this.spotId = spotId;
        this.vehicleType = vehicleType;
        this.isNearElevator = isNearElevator;
        this.isNearEntrance = isNearEntrance;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isNearElevator() {
        return isNearElevator;
    }

    public boolean isNearEntrance() {
        return isNearEntrance;
    }
}
