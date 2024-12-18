package org.example;

public enum Note {
    ONE(1),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50);

    public final int value;

    Note(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
