package org.example;

public class Main {
    public static void main(String[] args) {
        TrafficController trafficController = TrafficController.getInstance();

        Road road1 = new Road("road_1");
        Road road2 = new Road("road_2");
        Road road3 = new Road("road_3");
        Road road4 = new Road("road_4");

        TrafficSignal trafficSignal1 = new TrafficSignal(6000, 3000, 9000);
        TrafficSignal trafficSignal2 = new TrafficSignal(6000, 3000, 9000);
        TrafficSignal trafficSignal3 = new TrafficSignal(6000, 3000, 9000);
        TrafficSignal trafficSignal4 = new TrafficSignal(6000, 3000, 9000);

        road1.setTrafficSignal(trafficSignal1);
        road2.setTrafficSignal(trafficSignal2);
        road3.setTrafficSignal(trafficSignal3);
        road4.setTrafficSignal(trafficSignal4);

        trafficController.addRoad(road1);
        trafficController.addRoad(road2);
        trafficController.addRoad(road3);
        trafficController.addRoad(road4);

        trafficController.startTrafficControl();
    }
}