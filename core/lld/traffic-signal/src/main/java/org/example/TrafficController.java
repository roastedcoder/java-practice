package org.example;

import java.util.HashMap;
import java.util.Map;

public class TrafficController {
    private static TrafficController instance;
    private Map<String, Road> roads;

    private TrafficController() {
        roads = new HashMap<>();
    }

    public static synchronized TrafficController getInstance() {
        if(instance == null) {
            instance = new TrafficController();
        }
        return instance;
    }

    public void addRoad(Road road) {
        roads.put(road.getName(), road);
    }

    public void removeRoad(Road road) {
        roads.remove(road.getName());
    }

    public void startTrafficControl() {
        for(Map.Entry<String, Road> entry: roads.entrySet()) {
            TrafficSignal trafficSignal = entry.getValue().getTrafficSignal();
            new Thread(() -> {
                System.out.println("Road: " + entry.getValue().getName() + ", signal: " + trafficSignal.getCurrentState().getColor());
                while (true) {
                    try {
                        Thread.sleep((int)trafficSignal.getRedState().getDuration());
                        trafficSignal.updateState();
                        System.out.println("Road: " + entry.getValue().getName() + ", signal: " + trafficSignal.getCurrentState().getColor());
                        Thread.sleep((int)trafficSignal.getRedState().getDuration());
                        trafficSignal.updateState();
                        System.out.println("Road: " + entry.getValue().getName() + ", signal: " + trafficSignal.getCurrentState().getColor());
                        Thread.sleep((int)trafficSignal.getRedState().getDuration());
                        trafficSignal.updateState();
                        System.out.println("Road: " + entry.getValue().getName() + ", signal: " + trafficSignal.getCurrentState().getColor());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public void handleEmergency(Road road) {
        TrafficSignal trafficSignal = road.getTrafficSignal();
        trafficSignal.setCurrentState(trafficSignal.getGreenState());
    }
}
