package pl.javaschool.java8ReadFileLineByLine;

import pl.javaschool.java8ReadFileLineByLine.java8Stream.Java8StreamFilterMyFileReader;
import pl.javaschool.java8ReadFileLineByLine.java8Stream.Java8StreamMyFileReader;

import java.util.List;

public class Main {
    private static String DIR = System.getProperty("user.dir") + "/target/classes/";

    public static void main(String[] args) {
        System.out.println("Reading file [Java 8 + Stream]:");
        readFileAndPrintToConsole(new Java8StreamMyFileReader());

        System.out.println("Reading file [Java 8 + Stream + Filtering]:");
        readFileAndPrintToConsole(new Java8StreamFilterMyFileReader());
    }

    private static void readFileAndPrintToConsole(MyFileReader myFileReader) {
        List<String> lines =  myFileReader.readFile(DIR + "lines.txt");
        System.out.println(lines);
    }

}