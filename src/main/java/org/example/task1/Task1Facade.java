package org.example.task1;

import org.example.utilities.InputHandler;
import org.example.utilities.Printer;
import java.util.Scanner;

public class Task1Facade {

    private InputHandler inputHandler;
    private Calculator calculator;


    public Task1Facade(Scanner scanner) {
        this.inputHandler = new InputHandler(scanner);
        this.calculator = new Calculator();
    }

    public void processList() {
        String input = inputHandler.getStringInput();
        Result result = calculator.calculateResult(input);
        Printer.printTask1Result(result);
    }
}
