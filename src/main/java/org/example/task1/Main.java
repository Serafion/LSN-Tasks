package org.example.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task1Facade facade = new Task1FacadeConfiguration().task1Facade(scanner);
        System.out.println("Please type numbers separated by single space");
        facade.processList();
    }
}
