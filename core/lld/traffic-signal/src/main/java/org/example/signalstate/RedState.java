package org.example.signalstate;
import org.example.TrafficSignal;

public class RedState implements SignalState{
    private final TrafficSignal trafficSignal;
    private double duration;
    private final String color;

    public RedState(TrafficSignal trafficSignal, double duration) {
        this.trafficSignal = trafficSignal;
        this.duration = duration;
        this.color = "red";
    }

    @Override
    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public void nextState() {
        trafficSignal.setCurrentState(trafficSignal.getGreenState());
    }

    public double getDuration() {
        return duration;
    }

    public String getColor() {
        return "red";
    }
}
