package org.example;

import org.example.datasource.DataSource;
import org.example.datasource.LibraryDatabaseCacheProxy;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DataSource theData = new LibraryDatabaseCacheProxy();
        HuskyLibrary snell = new HuskyLibrary(theData);
        snell.run();
    }
}
