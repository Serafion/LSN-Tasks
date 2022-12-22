package org.example.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Calculator {

    public static final String SPLITTER = " ";

    public Result calculateResult(String input) {
        List<Integer> integerList = Arrays.stream(input.split(SPLITTER)).mapToInt(Integer::valueOf).sorted().boxed().collect(Collectors.toList());
        List<Integer> set = integerList.stream().distinct().collect(Collectors.toList());
        Integer max = set.get(set.size()-1);
        Integer min = set.get(0);
        Integer distinct = set.size();
        Integer count = integerList.size();
        return new Result(count,set,distinct,min,max);
    }
}
