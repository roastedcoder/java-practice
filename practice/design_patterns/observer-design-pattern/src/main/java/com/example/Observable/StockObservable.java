package com.example.Observable;

import com.example.Observer.NotificationAlertObserver;

public interface StockObservable {
  void add(NotificationAlertObserver observer);
  void remove(NotificationAlertObserver observer);
  void notifySubscriber();
  void setStockCount(int newStockAdded);
  int getStockCount();
}
