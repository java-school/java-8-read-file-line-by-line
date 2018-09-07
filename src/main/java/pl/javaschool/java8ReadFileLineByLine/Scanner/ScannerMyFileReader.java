package pl.javaschool.java8ReadFileLineByLine.Scanner;

import pl.javaschool.java8ReadFileLineByLine.MyFileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerMyFileReader implements MyFileReader {

    @Override
    public List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return lines;
    }
}
