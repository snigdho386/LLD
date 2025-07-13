public class Vehicle {
    public VehicleType vehicleType;
    public String regNo;

    public Vehicle(VehicleType vehicleType,String regNo){
        this.regNo = regNo;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getRegNo() {
        return regNo;
    }
}
