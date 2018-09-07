package pl.javaschool.java8ReadFileLineByLine;

import pl.javaschool.java8ReadFileLineByLine.java8Stream.Java8StreamFileReader;

import java.util.List;

public class Main {
    private static String DIR = System.getProperty("user.dir") + "/target/classes/";

    public static void main(String[] args) {
        System.out.println("Reading file [Java 8 + Stream]:");
        Java8StreamFileReader fileReader = new Java8StreamFileReader();
        List<String> lines =  fileReader.readFile(DIR + "lines.txt");
        System.out.println(lines);
    }

}