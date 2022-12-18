package org.example.task1;

public class Printer {
    public void printResult(Result result) {

        System.out.println(result.numbers().toString().replaceAll("[\\[|\\]|,]",""));
        System.out.println("count: "+result.count());
        System.out.println("distinct: "+result.distinct());
        System.out.println("min: "+result.min());
        System.out.print("max: "+result.max());
    }
}
