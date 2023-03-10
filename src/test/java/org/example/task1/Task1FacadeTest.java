package org.example.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

class Task1FacadeTest {

    private final InputStream inputStream = System.in;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    void finish() {
        System.setIn(inputStream);
        System.setOut(originalOut);
    }

    @Test
    void simpleTest() throws IOException {
        //Given
        String input = "1 10 20 20 2 5";
        String result = "1 2 5 10 20\r\n" +
                "count: 6\r\n" +
                "distinct: 5\r\n" +
                "min: 1\r\n" +
                "max: 20";
        //When
        try( InputStream in = new ByteArrayInputStream(input.getBytes()) ) {
            System.setIn(in);
            System.setOut(new PrintStream(out));
            new Task1FacadeConfiguration().task1FacadeForTests().processList();
        }
        //Then
        Assertions.assertEquals(result,out.toString());
    }

}