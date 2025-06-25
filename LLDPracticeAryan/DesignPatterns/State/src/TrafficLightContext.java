public class TrafficLightContext {

    TrafficLightState trafficLightState;

    public TrafficLightContext(){
        trafficLightState = new GreenLightState();
    }

    public void setTrafficLightState(TrafficLightState trafficLightState){
        this.trafficLightState = trafficLightState;
    }

    public void next(){
        trafficLightState.next(this);
    }

    public void getColor(){
        System.out.println(trafficLightState.getColor());
    }

}
