package org.example.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2Mapper {

    public static List<List<Integer>> mapToList(Task2Result task2Result){
        List<List<Integer>> resultList = new ArrayList<>();
        for (Pair p: task2Result.getPairs()) {
            List<Integer> result = new ArrayList<>();
            result.add(p.value1);
            result.add(p.value2);
            resultList.add(result);
        }
        return resultList;
    }
}
