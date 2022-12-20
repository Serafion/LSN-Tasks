package org.example.task2;

import org.example.utilities.Printer;

import java.util.Scanner;
import static org.example.utilities.Printer.*;

public class Task2Facade {

    InputHandler inputHandler;
    Calculator calculator;

    public Task2Facade(Scanner scanner) {
        this.inputHandler = new InputHandler(scanner);
        this.calculator = new Calculator();

    }

    public Task2Facade(InputHandler inputHandler, Calculator calculator) {
        this.inputHandler = inputHandler;
        this.calculator = calculator;
    }

    public void processList() {
        String input  = inputHandler.getInput();
        Task2Result result = calculator.calculatePairs(input);
        Printer.printTask2result(Task2Mapper.mapToList(result));
    }
}
