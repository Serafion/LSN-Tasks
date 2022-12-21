package org.example.task3;

import java.util.ArrayList;
import java.util.List;

public class GraphRepo {

    private List<Graph> graphs = new ArrayList<>();

    public void addGraph(Graph graph){
        graphs.add(graph);
    }

    public Integer noOfDistinctGraphs(){
        return graphs.size();
    }
}
