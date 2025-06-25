public class RedLightState implements TrafficLightState{

    @Override
    public void next(TrafficLightContext trafficLightContext) {
        trafficLightContext.setTrafficLightState(new GreenLightState());
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
