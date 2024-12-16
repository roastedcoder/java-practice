package org.example.trafficlight;

import org.example.TrafficLight;
import org.example.TrafficLightEnum;

public class GreenState implements State{
    @Override
    public void setState(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }

    public TrafficLightEnum getColor() {
        return TrafficLightEnum.GREEN;
    }
}
