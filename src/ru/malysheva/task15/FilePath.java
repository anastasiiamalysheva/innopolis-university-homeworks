package ru.malysheva.task15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FilePath {

    public static void main(String[] args) throws IOException {

        //создание файла
        Path testFile = Files.createFile ( Paths.get ( "C:\\Users\\Username\\Desktop\\testFile.txt" ) );
        System.out.println ( "Был ли файл успешно создан?" );
        System.out.println ( Files.exists ( Paths.get ( "C:\\Users\\Username\\Desktop\\testFile.txt" ) ) );

        //копирование файла
        testFile = Files.copy ( testFile, Paths.get ( "C:\\Users\\Username\\Desktop\\testDirectory2\\testFile.txt" ), REPLACE_EXISTING );
        System.out.println ( "Остался ли наш файл на рабочем столе?" );
        System.out.println ( Files.exists ( Paths.get ( "C:\\Users\\Username\\Desktop\\testFile.txt" ) ) );

        //переименование файла
        Path testFile1 = (Paths.get ( "C:\\Users\\Username\\Desktop\\testDirectory2\\testFile.txt" ));
        try {
            Files.move ( testFile1, testFile1.resolveSibling ( "newName.txt" ) );
        } catch (IOException e) {
            e.printStackTrace ();
        }

        //удаление файла
        Files.delete ( testFile );
        System.out.println ( "Файл все еще существует?" );
        System.out.println ( Files.exists ( Paths.get ( "C:\\Users\\Username\\Desktop\\testDirectory\\testFile.txt" ) ) );
    }
}
