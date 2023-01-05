package org.example.task2;

import java.util.*;
import java.util.stream.Collectors;

class Calculator {

    private final int GIVEN_SUM_VALUE = 13;
    private Task2Result result;
    private Set<Integer> searchedValues;

    public Calculator() {
        this.searchedValues = new TreeSet<>();
        this.result = new Task2Result();
    }

    Task2Result calculatePairs(String input){
        List<Integer> numbers = fetchNumbersList(input);
        // n time complexity below:
        for(int i=0;i<numbers.size();i++){
            Integer currentNumber = numbers.get(i);
            Integer searchedValue = calcSearchedValue(currentNumber);
            searchedValues.add(searchedValue);
            if(valueWasSearchedBefore(currentNumber)){
                addToResult(currentNumber, searchedValue);
            }
        }
        result.sortResult();
        return result;
    }

    private int calcSearchedValue(Integer currentNumber) {
        return GIVEN_SUM_VALUE - currentNumber;
    }

    private boolean valueWasSearchedBefore(Integer currentNumber) {
        return searchedValues.contains(currentNumber);
    }

    private void addToResult(Integer number, Integer secondPartOfPair) {
        result.addPair(new Pair(number, secondPartOfPair));
    }

    private List<Integer> fetchNumbersList(String input) {
        List<Integer> numbers;
        try{
            numbers = Arrays.stream(input.split(" "))
                            .mapToInt(Integer::valueOf)
                            .boxed()
                            .sorted(Collections.reverseOrder())
                            .collect(Collectors.toList());
        } catch (NumberFormatException e){
            System.out.println("There was wrong input provided");
            numbers = new ArrayList<>();
        }
        return numbers;
    }
}
