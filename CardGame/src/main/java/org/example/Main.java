package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(FileReader.generateCardCollectionFrom("sampleData/cards.txt"));

    }
}