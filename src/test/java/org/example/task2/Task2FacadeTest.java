package org.example.task2;

import org.example.task1.Task1Facade;
import org.junit.jupiter.api.*;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Task2FacadeTest {

    private final InputStream inputStream = System.in;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    @BeforeEach
    void setUp() {
        System.setIn(inputStream);
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

    @Test
    void simpleTest2() throws IOException {

        //Given
        String input = "5 8 2 11 1 4 6 7 13 0";
        String result = "0 13\r\n" +
                "2 11\r\n" +
                "5 8\r\n" +
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