package com.example.Observer;

import com.example.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
  String mobileNo;
  StockObservable observable;

  public MobileAlertObserver(String mobileNo, StockObservable observable) {
    this.observable = observable;
    this.mobileNo = mobileNo;
  }

  @Override
  public void update() {
    sendMsgOnMobile();
  }

  private void sendMsgOnMobile() {
    System.out.println("Message sent to: " + mobileNo + " :: " + "Product is in stock hurry up: " + observable.getStockCount());
  }
}
