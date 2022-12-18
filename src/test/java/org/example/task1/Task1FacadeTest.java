package org.example.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

class Task1FacadeTest {

    private final InputStream inputStream = System.in;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    void simpleTest() throws IOException {
        String input = "1 10 20 20 2 5";
        try( InputStream in = new ByteArrayInputStream(input.getBytes()) ) {
            System.setIn(in);
            System.setOut(new PrintStream(out));
            String result = "1 2 5 10 20\r\n" +
                    "count: 6\r\n" +
                    "distinct: 5\r\n" +
                    "min: 1\r\n" +
                    "max: 20";
            new Task1Facade().processList();
            Assertions.assertEquals(result,out.toString());
        } finally {
            System.setIn(inputStream);
            System.setOut(originalOut);

        }

    }

}