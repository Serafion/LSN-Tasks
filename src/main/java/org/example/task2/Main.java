package org.example.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task2Facade facade = new Task2FacadeConfiguration().task2Facade(scanner);
        System.out.println("Please type numbers separated by space");
        facade.processList();
    }
}
