package org.example.task1;

import java.util.Scanner;

class InputHandler {

    private final Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String getInput(){
        return scanner.nextLine();
    }
}
