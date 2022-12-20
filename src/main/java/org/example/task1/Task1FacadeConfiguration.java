package org.example.task1;

import java.util.Scanner;

public class Task1FacadeConfiguration {

    Task1Facade task1FacadeForTests(){
        return new Task1Facade(new Scanner(System.in));
    }

    Task1Facade task1Facade(Scanner scanner){
        return new Task1Facade(scanner);
    }
}
