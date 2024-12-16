package org.example.trafficlight;

import org.example.TrafficLight;
import org.example.TrafficLightEnum;

public interface State {
    void setState(TrafficLight trafficLight);
    TrafficLightEnum getColor();
}
