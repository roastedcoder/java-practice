package org.example.vendingmachinestates;

import org.example.*;

public class DispenseState implements VendingMachineState{
    private final VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Product already selected");
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Payment already made");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Payment already made");
    }

    @Override
    public void dispenseProduct() {
        vendingMachine.setState(vendingMachine.getReadyState());
        Product product = vendingMachine.getSelectedProduct();
        Inventory inventory = vendingMachine.getInventory();
        inventory.addProduct(product, inventory.getCount(product) - 1);
        System.out.println("Product " + product.getName() + " dispensed");
        vendingMachine.setState(vendingMachine.getSettledState());
    }

    @Override
    public void settlePayment() {

    }
}
