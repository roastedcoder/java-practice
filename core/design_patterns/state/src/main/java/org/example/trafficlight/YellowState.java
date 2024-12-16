package org.example.trafficlight;

import org.example.TrafficLight;
import org.example.TrafficLightEnum;

public class YellowState implements State{
    @Override
    public void setState(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }

    public TrafficLightEnum getColor() {
        return TrafficLightEnum.YELLOW;
    }
}
