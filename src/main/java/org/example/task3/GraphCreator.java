package org.example.task3;

import java.util.List;

public class GraphCreator {

    Graph createGraph(List<Nodes> nodes){
        Graph graph = new Graph();
        if(graph.isEmpty()){
            graph.addNode(nodes.get(0));
            nodes.remove(0);
        }
        boolean addingPhase = true;
        while(addingPhase&& !nodes.isEmpty()){
            for(int i=0;i< nodes.size();i++){
                addingPhase=false;
                Nodes node = nodes.get(i);

                if(isContainsEnd(graph, node) || isContainsNode(graph, node)){
                    graph.addNode(node);
                    nodes.remove(i);
                    addingPhase=true;
                }
            }
        }
        return graph;
    }

    private static boolean isContainsNode(Graph graph, Nodes node) {
        return graph.containsNode(node.getNextNode());
    }

    private static boolean isContainsEnd(Graph graph, Nodes node) {
        return graph.containsEnd(node.getNodeNumber());
    }
}
