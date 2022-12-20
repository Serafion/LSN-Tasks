package org.example.task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Calculator {

    private final int GIVEN_SUM_VALUE = 13;
    Task2Result result = new Task2Result();

    Task2Result calculatePairs(String input){
        List<Integer> numbers = fetchNumbersList(input);

//        for(Integer i : numbers){
//            Integer searchedNumber = calculatePairNumber(i);
//            for (Integer b : numbers){
//                if(b.equals(searchedNumber)){
//                    addToResult(i,b);
//                }
//            }
//        }
//        for(int i=result.getPairs().size();i>(result.getPairs().size()/2);i--){
//            result.getPairs().remove(i);
//        }

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

    private int calculatePairNumber(int i) {
        return GIVEN_SUM_VALUE - i;
    }

//    private static void removeFromList(List<Integer> numbers, Integer secondPartOfPair) {
//        numbers.remove(secondPartOfPair);
//    }

    private void addToResult(Integer number, Integer secondPartOfPair) {
        result.addPair(new Pair(number, secondPartOfPair));
    }

    private List<Integer> fetchNumbersList(String input) {
        return Arrays.stream(input.split(" ")).mapToInt(Integer::valueOf).sorted().boxed().collect(Collectors.toList());
    }
}
