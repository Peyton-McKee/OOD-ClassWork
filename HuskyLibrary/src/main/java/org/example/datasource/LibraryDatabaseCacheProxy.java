package org.example.datasource;

import java.util.HashMap;

public class LibraryDatabaseCacheProxy implements DataSource {

    private LibraryDatabase db = new LibraryDatabase();
    private HashMap<String, String> cache = new HashMap<>();

    private boolean isCached(String isbn) {
        return cache.containsKey(isbn);
    }

    private String getCachedTitle(String isbn) {
        return cache.get(isbn);
    }

    @Override
    public String searchDatabase(String isbn) {
        if (this.isCached(isbn)) {
            return this.getCachedTitle(isbn);
        }
        String title = db.searchDatabase(isbn);
        cache.put(isbn, title);
        return title;
    }
}
