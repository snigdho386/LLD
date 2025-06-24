//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle bmw = new PassengerVehicle();
        bmw.drive();
        Vehicle rangeRover = new OffroadVehicle();
        rangeRover.drive();
    }
}