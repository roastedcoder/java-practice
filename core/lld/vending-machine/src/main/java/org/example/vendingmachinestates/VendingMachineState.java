package org.example.vendingmachinestates;

import org.example.Coin;
import org.example.Note;
import org.example.Product;

public interface VendingMachineState {
    void selectProduct(Product product);
    void insertCoin(Coin coin);
    void insertNote(Note note);
    void dispenseProduct();
    void settlePayment();
}
