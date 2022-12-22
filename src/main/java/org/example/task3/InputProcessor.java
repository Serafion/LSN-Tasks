package org.example.task3;

import java.util.ArrayList;
import java.util.List;

public class InputProcessor {

    private static final String SPLITTER = " ";
    private static final int BASE_NODE_INDEX = 0;
    private static final int NEXT_NODE_INDEX = 1;

    public List<Nodes> processInput(List<String> input){
        List<Nodes> nodesList = new ArrayList<>();
        for(String s : input){
            String[] array = s.split(SPLITTER);
            nodesList.add(new Nodes(Integer.valueOf(array[BASE_NODE_INDEX]),Integer.valueOf(array[NEXT_NODE_INDEX])));
        }
        return nodesList;
    }
}
