package ru.malysheva.task19;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Receipt {
    public static void main(String[] args) throws IOException {
        Files.lines ( Paths.get ( "/Users/anastasiia/IdeaProjects/homeTasks/src/ru/malysheva/task19/products" ),
                StandardCharsets.UTF_8 ).forEach ( System.out::println );
    }
}

