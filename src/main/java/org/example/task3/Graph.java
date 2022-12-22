package org.example.task3;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Nodes> nodesList = new ArrayList<>();

    public Graph() {
    }

    public void addNode(Nodes node){
        nodesList.add(node);
    }

    public boolean containsNode(Nodes node){
        return nodesList.contains(node);
    }

    public boolean isEmpty(){
        return nodesList.isEmpty();
    }

    public boolean containsNode(Integer node){
        return nodesList.stream()
                        .map(x -> x.getNodeNumber())
                        .filter(x -> x.equals(node))
                        .count()==1;
    }

    public boolean containsEnd(Integer node){
        return nodesList.stream()
                        .map(x -> x.getNextNode())
                        .filter(x -> x.equals(node))
                        .count()==1;
    }

    public List<Nodes> getNodes() {
        return nodesList;
    }
}
