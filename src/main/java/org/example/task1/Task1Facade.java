package org.example.task1;

public class Task1Facade {

    InputHandler inputHandler;
    Calculator calculator;
    Printer printer;

    public Task1Facade() {
        this.inputHandler = new InputHandler();
        this.calculator = new Calculator();
        this.printer = new Printer();
    }

    public void processList() {
        String input = inputHandler.getInput();
        Result result = calculator.calculateResult(input);
        printer.printResult(result);
    }
}
