package org.example.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Calculator {
    public Result calculateResult(String input) {
        List<Integer> list = Arrays.stream(input.split(" ")).mapToInt(Integer::valueOf).sorted().boxed().toList();
        List<Integer> set = list.stream().sorted().distinct().collect(Collectors.toList());
        Integer max = list.get(list.size()-1);
        Integer min = list.get(0);
        Integer distinct = set.size();
        Integer count = list.size();
        return new Result(count,set,distinct,min,max);
    }
}
