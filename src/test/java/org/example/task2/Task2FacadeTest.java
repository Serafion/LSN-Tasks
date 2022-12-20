package org.example.task2;

import org.example.task1.Task1Facade;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class Task2FacadeTest {

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
        String input = "1 2 10 7 5 3 6 6 13 0";
        String result = "0 13\r\n" +
                "3 10\r\n" +
                "6 7\r\n" +
                "6 7";

        //When
        try (InputStream in = new ByteArrayInputStream(input.getBytes())) {
            System.setIn(in);
            new Task2Facade().processList();
        }

        //Then
        Assertions.assertEquals(result, out.toString());


    }

}