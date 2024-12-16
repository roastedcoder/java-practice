package org.example.trafficlight;

import org.example.TrafficLight;
import org.example.TrafficLightEnum;

public class RedState implements State{

    @Override
    public void setState(TrafficLight trafficLight) {
        trafficLight.setState(new GreenState());
    }

    @Override
    public TrafficLightEnum getColor() {
        return TrafficLightEnum.RED;
    }
}
