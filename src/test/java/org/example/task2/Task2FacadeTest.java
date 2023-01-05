package org.example.task2;

import org.example.utilities.InputHandler;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class Task2FacadeTest {

    private final InputStream inputStream = System.in;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    InputHandler inputHandler = mock(InputHandler.class);


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
    void testSystemOut() throws IOException {
        //Given
        String input = "1 2 10 7 5 3 6 6 13 0";
        String result = "0 13\r\n" +
                "3 10\r\n" +
                "6 7\r\n" +
                "6 7";

        //When
        try (InputStream in = new ByteArrayInputStream(input.getBytes())) {
            Scanner scanner = new Scanner(in);
            new Task2FacadeConfiguration().task2Facade(scanner).processList();
        }

        //Then
      assertThat(result).isEqualTo(out.toString());


    }

    @Test
    void simpleTest2() {
        //Given
        when(inputHandler.getStringInput()).thenReturn("5 8 2 11 1 4 6 7 13 0");
        String result = "0 13\r\n" +
                "2 11\r\n" +
                "5 8\r\n" +
                "6 7";

        //When
        new Task2Facade(inputHandler).processList();

        //Then
        assertThat(result).isEqualTo(out.toString());


    }

}