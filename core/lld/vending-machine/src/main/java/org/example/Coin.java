package org.example;

public enum Coin {
    TENTH(0.1),
    QUARTER(0.25),
    HALF(0.5);

    public final double value;

    Coin(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
