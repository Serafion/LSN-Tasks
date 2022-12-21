package org.example.task3;

import java.util.Objects;

public class Nodes {
    private Integer nodeNumber;
    private Integer nextNode;

    public Nodes(Integer nodeNumber, Integer nextNode) {
        this.nodeNumber = nodeNumber;
        this.nextNode = nextNode;
    }

    public Integer getNodeNumber() {
        return nodeNumber;
    }

    public Integer getNextNode() {
        return nextNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nodes nodes = (Nodes) o;
        return Objects.equals(nodeNumber, nodes.nodeNumber) && Objects.equals(nextNode, nodes.nextNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeNumber, nextNode);
    }
}
