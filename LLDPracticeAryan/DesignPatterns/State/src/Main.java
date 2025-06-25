//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TrafficLightContext trafficLightContext= new TrafficLightContext();

        trafficLightContext.getColor();
        trafficLightContext.next(); // Green -> Yellow

        trafficLightContext.getColor();
        trafficLightContext.next(); // Yellow -> Red


        trafficLightContext.getColor();
        trafficLightContext.next(); // Red-> Green


        trafficLightContext.getColor();
        trafficLightContext.next();


    }
}