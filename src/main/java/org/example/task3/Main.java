package org.example.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task3Facade facade = new Task3FacadeConfiguration().task3Facade(scanner);
        System.out.println("Please type number of nodes and then type nodes");
        facade.fetchDistinctGraphsCount();

    }
}
