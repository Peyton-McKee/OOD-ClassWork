package org.example;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FileWalker implements FileVisitor<Path> {
    ArrayList<String> list = new ArrayList<String>();
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        String fileName = file.getFileName().toString();
        if(fileName.split("\\.")[1].equals("pdf")) {
            this.list.add(file.getFileName().toString());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    public String displayListAlphabetically() {
        String[] sortedList = Stream.of(this.list).sorted().toArray(String[]::new);
        StringBuilder sortedText = new StringBuilder();
        for (String file: sortedList) {
            sortedText.append(file).append(",\n");
        }
        return sortedText.toString();
    }
}
