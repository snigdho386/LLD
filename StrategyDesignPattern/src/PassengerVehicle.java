import Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDrive());
    }
}
