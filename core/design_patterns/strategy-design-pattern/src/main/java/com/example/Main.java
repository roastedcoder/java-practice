package com.example;

import com.example.with_strategy.GoodsVehicleW;
import com.example.with_strategy.OffRoadVehicleW;
import com.example.with_strategy.PassangerVehicleW;
import com.example.with_strategy.SportsVehicleW;
import com.example.without_strategy.GoodsVehicle;
import com.example.without_strategy.OffRoadVehicle;
import com.example.without_strategy.PassangerVehicle;
import com.example.without_strategy.SportsVehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        
        // without strategy
        System.out.println("Without Strategy design pattern");
        SportsVehicle sv = new SportsVehicle();
        OffRoadVehicle ov = new OffRoadVehicle();
        PassangerVehicle pv = new PassangerVehicle();
        GoodsVehicle gv = new GoodsVehicle();

        System.out.println("SportVehicle drive capabality: " + sv.drive());
        System.out.println("OffRoadVehicle drive capability: " + ov.drive());
        System.out.println("PassangerVehicle drive capability: " + pv.drive());
        System.out.println("GoodsVehicle drive capability: " + gv.drive());

        // with strategy
        System.out.println();
        System.out.println("With Strategy design pattern");
        SportsVehicleW svw = new SportsVehicleW();
        OffRoadVehicleW ovw = new OffRoadVehicleW();
        PassangerVehicleW pvw = new PassangerVehicleW();
        GoodsVehicleW gvw = new GoodsVehicleW();

        System.out.println("SportVehicle drive capabality: " + svw.drive());
        System.out.println("OffRoadVehicle drive capability: " + ovw.drive());
        System.out.println("PassangerVehicle drive capability: " + pvw.drive());
        System.out.println("GoodsVehicle drive capability: " + gvw.drive());
    }
}