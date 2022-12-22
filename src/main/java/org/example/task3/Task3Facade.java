package org.example.task3;

import org.example.utilities.InputHandler;
import org.example.utilities.Printer;

import java.util.List;

public class Task3Facade {
    
    private InputHandler inputHandler;
    private InputProcessor inputProcessor;
    private GraphRepo graphRepo;
    private GraphCreator graphCreator;

    public Task3Facade(InputHandler inputHandler, InputProcessor inputProcessor, GraphRepo graphRepo, GraphCreator graphCreator) {
        this.inputHandler = inputHandler;
        this.inputProcessor = inputProcessor;
        this.graphRepo = graphRepo;
        this.graphCreator=graphCreator;

    }

    public Integer fetchDistinctGraphsCount() {
        Integer noOfRows = inputHandler.getInt();
        List<String> input = inputHandler.getStringList(noOfRows);
        List<Nodes> nodes = inputProcessor.processInput(input);
        while(!nodes.isEmpty()){
            Graph graph = processNodesIntoNewGraph(nodes);
            nodes.removeAll(graph.getNodes());
        }
        Integer numberOfDistinctGraphs = graphRepo.noOfDistinctGraphs();
        Printer.printTask3Result(numberOfDistinctGraphs);
        return numberOfDistinctGraphs;
    }

    private Graph processNodesIntoNewGraph(List<Nodes> nodes) {
        Graph graph = graphCreator.createGraph(nodes);
        graphRepo.addGraph(graph);
        return graph;

    }
}
