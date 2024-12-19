package org.example.signalstate;

import org.example.TrafficSignal;

public class GreenState implements SignalState{
    private final TrafficSignal trafficSignal;
    private double duration;
    private final String color;

    public GreenState(TrafficSignal trafficSignal, double duration) {
        this.trafficSignal = trafficSignal;
        this.duration = duration;
        this.color = "green";
    }

    @Override
    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public void nextState() {
        trafficSignal.setCurrentState(trafficSignal.getYellowState());
    }

    public double getDuration() {
        return duration;
    }

    public String getColor() {
        return "green";
    }

}
