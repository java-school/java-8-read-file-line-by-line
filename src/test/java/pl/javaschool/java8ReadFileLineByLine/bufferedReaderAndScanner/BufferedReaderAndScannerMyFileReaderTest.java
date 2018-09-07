package pl.javaschool.java8ReadFileLineByLine.bufferedReaderAndScanner;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class BufferedReaderAndScannerMyFileReaderTest {
    private BufferedReaderAndScannerMyFileReader fileReader;

    @Before
    public void setUp() {
        fileReader = new BufferedReaderAndScannerMyFileReader();
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
        return asList("line1", "line2", "line3", "line4", "line5");
    }

}