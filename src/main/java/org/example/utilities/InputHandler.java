package org.example.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputHandler {

    private Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getStringInput() {
        return scanner.nextLine();
    }

    public int getInt(){
        return Integer.valueOf(scanner.nextLine());
    }

    public List<String> getStringList(Integer numberOfRows){
        List<String> list = new ArrayList<>();
        for(int i=1;i==numberOfRows;i++){
            list.add(scanner.nextLine());
        }
        return list;
    }
}
