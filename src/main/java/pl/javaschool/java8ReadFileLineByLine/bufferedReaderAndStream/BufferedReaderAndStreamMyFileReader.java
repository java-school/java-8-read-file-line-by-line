package pl.javaschool.java8ReadFileLineByLine.bufferedReaderAndStream;

import pl.javaschool.java8ReadFileLineByLine.MyFileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BufferedReaderAndStreamMyFileReader implements MyFileReader {
    @Override
    public List<String> readFile(String fileName) {
        List<String> list = new ArrayList<>();

        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(fileName))) {

            list = bufferedReader.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
