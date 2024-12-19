package org.example;

import org.example.signalstate.SignalState;

public class Road {
    private TrafficSignal trafficSignal;
    private final String name;

    public Road(String name) {
        this.name = name;
    }

    public void setTrafficSignal(TrafficSignal trafficSignal) {
        this.trafficSignal = trafficSignal;
    }

    public TrafficSignal getTrafficSignal() {
        return this.trafficSignal;
    }

    public SignalState getCurrentState() {
        return trafficSignal.getCurrentState();
    }

    public String getName() {
        return this.name;
    }

    public void updateState() {
        trafficSignal.updateState();
    }

}
