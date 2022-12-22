package org.example.task3;

import org.example.utilities.InputHandler;

import java.util.Scanner;

public class Task3FacadeConfiguration {

    Task3Facade task3FacadeForTest(InputHandler inputHandler){
        return new Task3Facade(inputHandler, new InputProcessor(), new GraphRepo(), new GraphCreator());
    }

    Task3Facade task3Facade(Scanner scanner){
        InputHandler inputHandler = new InputHandler(scanner);
        return new Task3Facade(inputHandler, new InputProcessor(), new GraphRepo(), new GraphCreator());
    }
}
