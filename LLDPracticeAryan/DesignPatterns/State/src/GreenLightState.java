public class GreenLightState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext trafficLightContext) {

        trafficLightContext.setTrafficLightState(new YellowLightState());

    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
