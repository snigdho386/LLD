public class YellowLightState implements TrafficLightState {

    @Override
    public void next(TrafficLightContext trafficLightContext) {
        trafficLightContext.setTrafficLightState(new RedLightState());

    }

    @Override
    public Color getColor() {
        return Color.YELLOW;
    }
}
