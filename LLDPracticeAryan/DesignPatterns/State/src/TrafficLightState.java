public interface TrafficLightState {

    public void next(TrafficLightContext trafficLightContext);
    public Color getColor();
}
