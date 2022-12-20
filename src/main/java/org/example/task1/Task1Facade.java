package org.example.task1;

import org.example.utilities.Printer;
import java.util.Scanner;

public class Task1Facade {

    InputHandler inputHandler;
    Calculator calculator;
    Printer printer;

    public Task1Facade(Scanner scanner) {
        this.inputHandler = new InputHandler(scanner);
        this.calculator = new Calculator();
    }

    public void processList() {
        String input = inputHandler.getInput();
        Result result = calculator.calculateResult(input);
        Printer.printTask1Result(result);
    }
}
