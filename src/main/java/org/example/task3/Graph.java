package org.example.task3;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Nodes> nodesList = new ArrayList<>();
    private List<Integer> nodeNumber = new ArrayList<>();
    private List<Integer> nodeEndsNumber = new ArrayList<>();

    public Graph() {
    }

    public void addNode(Nodes node){
        nodesList.add(node);
        nodeNumber.add(node.getNodeNumber());
        if(node.getNextNode()!=null){
        nodeEndsNumber.add(node.getNextNode());}
    }

    public boolean containsNode(Nodes node){
        return nodesList.contains(node);
    }

    public boolean isEmpty(){
        return nodesList.isEmpty();
    }

    public boolean containsNode(Integer node){
        return nodeNumber.contains(node);
    }

    public boolean containsEnd(Integer node){
        return nodeEndsNumber.contains(node);
    }
}
