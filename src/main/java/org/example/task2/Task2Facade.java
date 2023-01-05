package org.example.task2;

import org.example.utilities.InputHandler;
import org.example.utilities.Printer;


public class Task2Facade {

    private InputHandler inputHandler;
    private Calculator calculator;

    public Task2Facade(InputHandler inputHandler) {
        this.inputHandler = inputHandler;
        this.calculator = new Calculator();

    }

    public Task2Facade(Calculator calculator) {
        this.calculator = calculator;
    }

    public void processList() {
        String input  = inputHandler.getStringInput();
        Task2Result result = calculator.calculatePairs(input);
        Printer.printTask2result(Task2Mapper.mapToList(result));
    }
}
