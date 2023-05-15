package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        FileWalker walker = new FileWalker();
        Files.walkFileTree(Path.of("sampleFiles"), walker);
        System.out.println(walker.displayListAlphabetically());
    }
}