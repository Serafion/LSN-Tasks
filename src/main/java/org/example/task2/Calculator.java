package org.example.task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Calculator {

    private final int GIVEN_SUM_VALUE = 13;
    Task2Result result = new Task2Result();

    Task2Result calculatePairs(String input){
        List<Integer> numbers = fetchNumbersList(input);

        for(int i=0;i<numbers.size();i++){
            Integer number = GIVEN_SUM_VALUE - numbers.get(i);
            for(int j=i+1;j<numbers.size();j++){
                if(numbers.get(j).equals(number)){
                    Integer secondPartOfPair = numbers.get(j);
                    addToResult(numbers.get(i), secondPartOfPair);
                }

            }
        }
        return result;
    }

    private void addToResult(Integer number, Integer secondPartOfPair) {
        result.addPair(new Pair(number, secondPartOfPair));
    }

    private List<Integer> fetchNumbersList(String input) {
        return Arrays.stream(input.split(" ")).mapToInt(Integer::valueOf).sorted().boxed().collect(Collectors.toList());
    }
}
