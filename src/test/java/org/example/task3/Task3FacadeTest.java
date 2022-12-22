package org.example.task3;

import org.example.utilities.InputHandler;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Task3FacadeTest {

    private final InputStream inputStream = System.in;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


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
    void testExactSystemOut() throws IOException {
        //Given
        when(inputHandler.getInt()).thenReturn(3);
        when(inputHandler.getStringList(any())).thenReturn(List.of("2 3", "1 2", "5 6"));
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
    void testSingleGraph() {
        //Given
        when(inputHandler.getInt()).thenReturn(3);
        when(inputHandler.getStringList(any())).thenReturn(List.of("2 3", "1 2", "3 4"));

        //When
        Integer result = new Task3FacadeConfiguration().task3FacadeForTest(inputHandler).fetchDistinctGraphsCount();

        //Then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void testSingleGraphDifferentNumbers() {

        //Given
        when(inputHandler.getInt()).thenReturn(3);
        when(inputHandler.getStringList(any())).thenReturn(List.of("2 7", "1 2", "7 15"));

        //When
        Integer result = new Task3FacadeConfiguration().task3FacadeForTest(inputHandler).fetchDistinctGraphsCount();

        //Then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void testSingleGraphLong2() {
        //Given
        when(inputHandler.getInt()).thenReturn(3);
        when(inputHandler.getStringList(any())).thenReturn(List.of("2 7", "1 2", "7 15", "15 1", "15 2"));

        //When
        Integer result = new Task3FacadeConfiguration().task3FacadeForTest(inputHandler).fetchDistinctGraphsCount();

        //Then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void testForCreating4Graphs() {
        //Given
        when(inputHandler.getInt()).thenReturn(8);
        when(inputHandler.getStringList(any())).thenReturn(List.of("1 2", "2 3", "5 6", "6 7", "3 4","10 11","11 12","20 21"));

        //When
        Integer result = new Task3FacadeConfiguration().task3FacadeForTest(inputHandler).fetchDistinctGraphsCount();

        //Then
        assertThat(result).isEqualTo(4);
    }
}