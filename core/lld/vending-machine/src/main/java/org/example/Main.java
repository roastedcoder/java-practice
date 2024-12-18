package org.example;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();

        Product coke = new Product("coke", 1.2);
        Product pepsi = new Product("pepsi", 1.2);
        Product water = new Product("water", 1);
        Product bobaMint = new Product("bobaMint", 1.3);

        vendingMachine.updateInventory(coke, 5);
        vendingMachine.updateInventory(pepsi, 5);
        vendingMachine.updateInventory(water, 10);
        vendingMachine.updateInventory(bobaMint, 3);

        vendingMachine.showProducts();


//        User action start: 0
        vendingMachine.selectProduct(coke);
//
        vendingMachine.insertNote(Note.ONE);
//
        vendingMachine.insertCoin(Coin.HALF);
//        vendingMachine.insertCoin(Coin.TENTH);
//
        vendingMachine.dispenseProduct();

//        System.out.println(vendingMachine.getTotalPayment() + " : " + vendingMachine.getSelectedProduct().getCost());

        vendingMachine.settlePayment();
//        System.out.print(vendingMachine.state());
    }
}