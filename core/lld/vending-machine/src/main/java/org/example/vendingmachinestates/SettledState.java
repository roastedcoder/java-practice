package org.example.vendingmachinestates;

import org.example.Coin;
import org.example.Note;
import org.example.Product;
import org.example.VendingMachine;

public class SettledState implements VendingMachineState{
    private final VendingMachine vendingMachine;

    public SettledState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Please collect the change first");
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Please collect the change first");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Please collect the change first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please collect the change first");
    }

    @Override
    public void settlePayment() {
        double change = vendingMachine.getTotalPayment() - vendingMachine.getSelectedProduct().getCost();
        if(change > 0) {
            System.out.println("Change returned: " + change);
            vendingMachine.resetPayment();
        } else {
            System.out.println("No change to return");
        }
        vendingMachine.resetSelectedProduct();
        vendingMachine.setState(vendingMachine.getIdleState());
    }
}
