package org.example.task2;

import java.util.ArrayList;
import java.util.List;

class Task2Result {

    List<Pair> pairs = new ArrayList<>();

    public List<Pair> getPairs() {
        return pairs;
    }

    public void addPair(Pair pair){
        pairs.add(pair);
    }
}
