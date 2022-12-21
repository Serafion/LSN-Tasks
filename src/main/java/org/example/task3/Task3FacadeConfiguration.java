package org.example.task3;

import org.example.utilities.InputHandler;

public class Task3FacadeConfiguration {

    Task3Facade task3FacadeForTest(InputHandler inputHandler){
        return new Task3Facade(inputHandler, new InputProcessor(), new GraphRepo(), new GraphCreator());
    }
}
