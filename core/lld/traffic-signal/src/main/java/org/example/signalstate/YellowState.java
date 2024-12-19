package org.example.signalstate;
import org.example.TrafficSignal;

public class YellowState implements SignalState{
    private final TrafficSignal trafficSignal;
    private double duration;
    private final String color;

    public YellowState(TrafficSignal trafficSignal, double duration) {
        this.trafficSignal = trafficSignal;
        this.duration = duration;
        this.color = "yellow";
    }

    @Override
    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public void nextState() {
        trafficSignal.setCurrentState(trafficSignal.getRedState());
    }

    public double getDuration() {
        return duration;
    }

    public String getColor() {
        return "yellow";
    }
}
