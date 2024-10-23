package com.example.Observer;

import com.example.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertObserver(String emailId, StockObservable observable) {
    this.observable = observable;
    this.emailId = emailId;
  }

    @Override
    public void update() {
      sendEmail();
    }

    private void sendEmail() {
      System.out.println("Message sent to: " + emailId + " :: " + "Product is in stock hurry up: " + observable.getStockCount());
    }

}
