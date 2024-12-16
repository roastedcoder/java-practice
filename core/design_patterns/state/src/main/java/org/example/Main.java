package org.example;

import org.example.trafficlight.RedState;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(new RedState());
        System.out.println(trafficLight.getLightColor());

        trafficLight.changeLight();
        System.out.println(trafficLight.getLightColor());

        trafficLight.changeLight();
        System.out.println(trafficLight.getLightColor());

        trafficLight.changeLight();
        System.out.println(trafficLight.getLightColor());
    }
}