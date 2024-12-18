package org.example.vendingmachinestates;

import org.example.Coin;
import org.example.Note;
import org.example.Product;
import org.example.VendingMachine;

public class IdleState implements VendingMachineState{
    private final VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        if(vendingMachine.getInventory().getCount(product) > 0) {
            vendingMachine.setSelectedProduct(product);
            vendingMachine.setState(vendingMachine.getReadyState());
            System.out.println("Product selected: " + product.getName());
        } else {
            System.out.println("Product not available");
        }
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Select a product first");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Select a product first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Select a product first");
    }

    @Override
    public void settlePayment() {
        System.out.println("Select a product first");
    }

}
