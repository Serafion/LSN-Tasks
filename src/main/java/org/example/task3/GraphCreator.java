package org.example.task3;

import java.util.Collection;
import java.util.List;

public class GraphCreator {

    Graph createGraph(Collection<Nodes> nodes){
        boolean addingPhase = true;
        List<Nodes> copy = List.copyOf(nodes);
        Graph graph = initializeNewGraph(copy);

        while(addingPhase && !nodes.isEmpty()){
            for (Nodes value : copy) {
                addingPhase = false;
                Nodes node = value;
                if (checkIfNodeIsAddableToGraph(graph, node)) {
                    graph.addNode(node);
                    addingPhase = true;
                }
            }
        }
        return graph;
    }

    private Graph  initializeNewGraph(List<Nodes> copy) {
        Graph graph = new Graph();
        Nodes startNode = copy.get(0);
        graph.addNode(startNode);
        return graph;
    }

    private boolean checkIfNodeIsAddableToGraph(Graph graph, Nodes node) {
        return containsEnd(graph, node) ||
               containsNode(graph, node) ||
               containsNode2(graph,node) ||
               containsEnd2(graph, node) ;
    }

    private boolean containsNode(Graph graph, Nodes node) {
        return graph.containsNode(node.getNextNode())&& !graph.containsNode(node);
    }

    private boolean containsEnd(Graph graph, Nodes node) {
        return graph.containsEnd(node.getNodeNumber())&& !graph.containsNode(node);
    }

    private boolean containsNode2(Graph graph, Nodes node) {
        return graph.containsNode(node.getNodeNumber())&& !graph.containsNode(node);
    }

    private boolean containsEnd2(Graph graph, Nodes node) {
        return graph.containsEnd(node.getNextNode())&& !graph.containsNode(node);
    }
}
