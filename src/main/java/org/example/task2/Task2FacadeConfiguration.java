package org.example.task2;

import org.example.utilities.InputHandler;

import java.util.Scanner;

public class Task2FacadeConfiguration {

    Task2Facade task2FacadeForTest(InputHandler inputHandler){
        return new Task2Facade(inputHandler);
    }

    Task2Facade task2Facade(Scanner scanner){
        return new Task2Facade(new InputHandler(scanner));
    }
}
