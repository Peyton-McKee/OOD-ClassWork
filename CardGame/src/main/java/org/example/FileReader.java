package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReader {

    public static CardCollection generateCardCollectionFrom(String filePath) {
        Path p = Path.of(filePath);

        Scanner s = null;
        try {
            s = new Scanner(p);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("File Path Does Not Lead to A readable File");
        }

        CardCollection collection = new CardCollection();

        if (s.hasNextLine()) {
            s.nextLine();
        }
        while (s.hasNextLine()) {
            String[] split = s.nextLine().split(" ");
            collection.addCard(new Card(split[0].charAt(0), split[1].charAt(0)));
        }
        return collection;
    }
}
