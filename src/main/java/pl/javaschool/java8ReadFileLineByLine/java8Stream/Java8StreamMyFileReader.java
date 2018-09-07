package pl.javaschool.java8ReadFileLineByLine.java8Stream;

import pl.javaschool.java8ReadFileLineByLine.MyFileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java8StreamMyFileReader implements MyFileReader {

    @Override
    public List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(lines::add);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
