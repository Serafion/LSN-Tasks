package org.example.task2;

import org.example.utilities.InputHandler;
import org.example.utilities.Printer;

import java.util.Scanner;


public class Task2Facade {

    InputHandler inputHandler;
    Calculator calculator;

    public Task2Facade() {
        this.inputHandler = new InputHandler(new Scanner(System.in));
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
