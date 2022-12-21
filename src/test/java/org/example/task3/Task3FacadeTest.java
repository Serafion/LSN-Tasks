package org.example.task3;

import org.example.utilities.InputHandler;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.*;
import java.util.List;
import java.util.Scanner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class Task3FacadeTest {

    private final InputStream inputStream = System.in;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Mock
    InputHandler inputHandler = mock(InputHandler.class);

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
        when(inputHandler.getInt()).thenReturn(3);
        when(inputHandler.getStringList(any())).thenReturn(List.of("2 3","1 2","5 6"));
        String input = "3\r\n2 3\r\n1 2\r\n5 6\r\n";
        String result = "2";


        //When
        try (InputStream in = new ByteArrayInputStream(input.getBytes())) {
            System.setIn(in);
            new Task3FacadeConfiguration().task3FacadeForTest(inputHandler).fetchDistinctGraphsCount();
        }

        //Then
        Assertions.assertEquals(result, out.toString());


    }

    @Test
    void simpleTest2() {

        //Given
        when(inputHandler.getInt()).thenReturn(3);
        when(inputHandler.getStringList(any())).thenReturn(List.of("2 3","1 2","3 4"));
        String result = "1";


        //When
        new Task3FacadeConfiguration().task3FacadeForTest(inputHandler).fetchDistinctGraphsCount();

        //Then
        Assertions.assertEquals(result, out.toString());


    }

    @Test
    void simpleTest3() {

        //Given
        when(inputHandler.getInt()).thenReturn(3);
        when(inputHandler.getStringList(any())).thenReturn(List.of("2 7","1 2","7 15"));
        String result = "1";


        //When
        new Task3FacadeConfiguration().task3FacadeForTest(inputHandler).fetchDistinctGraphsCount();

        //Then
        Assertions.assertEquals(result, out.toString());


    }

    @Test
    void simpleTest4() {

        //Given
        when(inputHandler.getInt()).thenReturn(3);
        when(inputHandler.getStringList(any())).thenReturn(List.of("2 7","1 2","7 15","15 1","15 2"));
        String result = "1";


        //When
        new Task3FacadeConfiguration().task3FacadeForTest(inputHandler).fetchDistinctGraphsCount();

        //Then
        Assertions.assertEquals(result, out.toString());


    }

}