package pl.javaschool.java8ReadFileLineByLine.java8Stream;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class Java8StreamFilterMyFileReaderTest {
    private Java8StreamFilterMyFileReader fileReader;

    @Before
    public void setUp() {
        fileReader = new Java8StreamFilterMyFileReader();
    }

    @Test
    public void shouldReturnListOfFileLines() {
        //given
        String givenFileName = System.getProperty("user.dir") + "/target/classes/lines.txt";
        //when
        List<String> actualLines = fileReader.readFile(givenFileName);
        //then
        assertEquals(expectedFileLines(), actualLines);
    }

    private List<String> expectedFileLines() {
        return asList("LINE1", "LINE2", "LINE3", "LINE5");
    }
}