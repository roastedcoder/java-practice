package org.example.vendingmachinestates;

import org.example.Coin;
import org.example.Note;
import org.example.Product;
import org.example.VendingMachine;

public class ReadyState implements VendingMachineState{
    private final VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Please insert note or coin");
    }

    @Override
    public void insertCoin(Coin coin) {
        vendingMachine.addCoin(coin);
        checkPaymentStatus();
    }

    @Override
    public void insertNote(Note note) {
        vendingMachine.addNote(note);
        checkPaymentStatus();
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert note or coin");
    }

    @Override
    public void settlePayment() {
        System.out.println("Please insert note or coin");
    }

    private void checkPaymentStatus() {
        if (vendingMachine.getTotalPayment() >= vendingMachine.getSelectedProduct().getCost()) {
            vendingMachine.setState(vendingMachine.getDispenseState());
        }
    }
}
