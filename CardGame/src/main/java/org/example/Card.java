package org.example;

public class Card {
    private char value;
    private char suit;

    public Card(char v, char s) {
        this.value = v;
        this.suit = s;
    }

    @Override
    public String toString() {
        return "[" + value + " " + suit + "]";
    }
}
