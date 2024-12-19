package org.example.signalstate;

public interface SignalState {
    void setDuration(double redDuration);
    void nextState();
    double getDuration();
    String getColor();
}
