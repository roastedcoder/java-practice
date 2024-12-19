package org.example;

import org.example.signalstate.GreenState;
import org.example.signalstate.RedState;
import org.example.signalstate.SignalState;
import org.example.signalstate.YellowState;

public class TrafficSignal {
    private SignalState currentState;
    private SignalState redState;
    private final SignalState greenState;
    private final SignalState yellowState;

    public TrafficSignal(double redDuration, double greenDuration, double yellowDuration) {
        this.redState = new RedState(this, redDuration);
        this.greenState = new GreenState(this, greenDuration);
        this.yellowState = new YellowState(this, yellowDuration);
        this.currentState = redState;
    }

    public SignalState getCurrentState() {
        return this.currentState;
    }

    public SignalState getRedState() {
        return redState;
    }

    public SignalState getYellowState() {
        return yellowState;
    }

    public SignalState getGreenState() {
        return greenState;
    }

    public void updateState() {
        currentState.nextState();
    }

    public void setCurrentState(SignalState state) {
        this.currentState = state;
    }
}
