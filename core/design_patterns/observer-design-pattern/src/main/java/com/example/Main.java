package com.example;

import com.example.Observable.IphoneObservableImpl;
import com.example.Observable.StockObservable;
import com.example.Observer.EmailAlertObserver;
import com.example.Observer.MobileAlertObserver;
import com.example.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        iphoneStockObservable.setStockCount(10);

        NotificationAlertObserver obs1 = new EmailAlertObserver("obs1@gmail.com", iphoneStockObservable);
        iphoneStockObservable.add(obs1);

        iphoneStockObservable.setStockCount(-10); // set stockCount = 0

        NotificationAlertObserver obs2 = new EmailAlertObserver("obs2@gmail.com", iphoneStockObservable);
        iphoneStockObservable.add(obs2);
        NotificationAlertObserver obs3 = new MobileAlertObserver("73016", iphoneStockObservable);
        iphoneStockObservable.add(obs3);

        iphoneStockObservable.setStockCount(1);
        iphoneStockObservable.setStockCount(-1); // set stockCount = 0
        iphoneStockObservable.setStockCount(5);
    }
}