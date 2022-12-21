package org.example.task3;

import org.example.utilities.InputHandler;
import org.example.utilities.Printer;

import java.util.List;

public class Task3Facade {
    
    InputHandler inputHandler;
    InputProcessor inputProcessor;

    GraphRepo graphRepo;

    GraphCreator graphCreator;

    public Task3Facade(InputHandler inputHandler, InputProcessor inputProcessor, GraphRepo graphRepo, GraphCreator graphCreator) {
        this.inputHandler = inputHandler;
        this.inputProcessor = inputProcessor;
        this.graphRepo = graphRepo;
        this.graphCreator=graphCreator;

    }

    public void fetchDistinctGraphsCount() {
        Integer noOfRows = inputHandler.getInt();
        List<String> input = inputHandler.getStringList(noOfRows);
        List<Nodes> nodes = inputProcessor.processInput(input);
        while(!nodes.isEmpty()){
            graphRepo.addGraph(graphCreator.createGraph(nodes));
        }
        Printer.printTask3Result(graphRepo.noOfDistinctGraphs());
    }
}
