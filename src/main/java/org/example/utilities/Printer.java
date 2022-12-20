package org.example.utilities;

import org.example.task1.Result;

public class Printer {
    public static void printTask1Result(Result result) {

        System.out.println(result.numbers().toString().replaceAll("[\\[|\\]|,]",""));
        System.out.println("count: "+result.count());
        System.out.println("distinct: "+result.distinct());
        System.out.println("min: "+result.min());
        System.out.print("max: "+result.max());
    }


}
