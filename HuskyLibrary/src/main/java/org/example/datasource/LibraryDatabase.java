package org.example.datasource;

import java.util.HashMap;

public class LibraryDatabase implements DataSource {
    private HashMap<String, String> database = new HashMap<>();

    public LibraryDatabase() {
        database.put("1111", "Head First Design Patterns");
        database.put("2222", "Core Java");
        database.put("1234", "Learning Java");
        database.put("4321", "Core Java Vol 2");
    }
    @Override
    public String searchDatabase(String isbn) {

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }

        if (database.containsKey(isbn)) {
            return database.get(isbn);
        } else {
            throw new IllegalArgumentException("ISBN Not Found!!");
        }
    }
}
