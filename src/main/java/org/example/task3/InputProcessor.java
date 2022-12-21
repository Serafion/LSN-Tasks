package org.example.task3;

import java.util.ArrayList;
import java.util.List;

public class InputProcessor {

    public List<Nodes> processInput(List<String> input){
        List<Nodes> nodesList = new ArrayList<>();
        for(String s : input){
            String[] array = s.split(" ");
            nodesList.add(new Nodes(Integer.valueOf(array[0]),Integer.valueOf(array[1])));
        }
        return nodesList;
    }
}
