package org.example;

import org.example.datasource.DataSource;

public class HuskyLibrary {
    private final DataSource theDatabase;

    public HuskyLibrary(DataSource d) {
        this.theDatabase = d;
    }

    public void run() {
        System.out.println("Searching for 1111...");
        String title = theDatabase.searchDatabase("1111");
        System.out.println("Title = " + title);
        System.out.println("Searching for 1234");
        title = theDatabase.searchDatabase("1234");
        System.out.println("Title = " + title);

    }
}
