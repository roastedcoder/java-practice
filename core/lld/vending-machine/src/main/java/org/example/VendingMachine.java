package org.example;

import org.example.vendingmachinestates.*;

public class VendingMachine {
    private static VendingMachine instance;
    private Inventory inventory;
    private double totalPayment;
    private Product selectedProduct;
    private VendingMachineState currentState;
    private VendingMachineState idleState;
    private VendingMachineState readyState;
    private VendingMachineState dispenseState;
    private VendingMachineState settledState;

    private VendingMachine() {
        inventory = new Inventory();
        totalPayment = 0.0;
        selectedProduct = null;
        idleState = new IdleState(this);
        readyState = new ReadyState(this);
        dispenseState = new DispenseState(this);
        settledState = new SettledState(this);
        currentState = idleState;
    }

    public static synchronized VendingMachine getInstance() {
        if(instance == null) {
            instance = new VendingMachine();
        }
        return instance;
    }

    public void selectProduct(Product product) {
        currentState.selectProduct(product);
    }

    public void insertCoin(Coin coin) {
        currentState.insertCoin(coin);
    }

    public void insertNote(Note note) {
        currentState.insertNote(note);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
    }

    public void settlePayment() {
        currentState.settlePayment();
    }

    public void updateInventory(Product product, Integer count) {
        inventory.addProduct(product, count);
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setSelectedProduct(Product product) {
        this.selectedProduct = product;
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getReadyState() {
        return this.readyState;
    }

    public VendingMachineState getIdleState() {
        return this.idleState;
    }

    public VendingMachineState getDispenseState() {
        return this.dispenseState;
    }

    public VendingMachineState getSettledState() {
        return this.settledState;
    }

    public void addCoin(Coin coin) {
        totalPayment += coin.getValue();
    }

    public void addNote(Note note) {
        totalPayment += note.getValue();
    }

    public double getTotalPayment() {
        return this.totalPayment;
    }

    public Product getSelectedProduct() {
        return this.selectedProduct;
    }

    public void resetPayment() {
        this.totalPayment = 0.0;
    }

    public void resetSelectedProduct() {
        this.selectedProduct = null;
    }

    public void showProducts() {
        inventory.showProducts();
    }

    public VendingMachineState state() {
        return currentState;
    }
}
