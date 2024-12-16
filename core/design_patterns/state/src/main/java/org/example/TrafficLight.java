package org.example;

import org.example.trafficlight.State;

public class TrafficLight {
    private State currentState;

    public TrafficLight(State currentState) {
        this.currentState = currentState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void changeLight() {
        currentState.setState(this);
    }

    public TrafficLightEnum getLightColor() {
        return currentState.getColor();
    }
}
