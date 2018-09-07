package pl.javaschool.java8ReadFileLineByLine.bufferedReaderAndScanner;

import pl.javaschool.java8ReadFileLineByLine.MyFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderAndScannerMyFileReader implements MyFileReader {
    @Override
    public List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
