package pl.javaschool.java8ReadFileLineByLine.java8Stream;

import pl.javaschool.java8ReadFileLineByLine.MyFileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamFilterMyFileReader implements MyFileReader {

    @Override
    public List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            //1. filter line4 (do not show this line)
            //2. convert text to upper case
            lines = stream
                    .filter(line -> !line.endsWith("4"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
