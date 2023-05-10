package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardCollectionTest {
    @Test
    public void testToString() {
        CardCollection c = new CardCollection();
        c.addCard(new Card('4', 'S'));
        assertEquals("{[4 S]}", c.toString());
    }
}