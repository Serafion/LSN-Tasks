package org.example.utilities;

import org.example.task1.Result;

import java.util.List;

public class Printer {
    public static void printTask1Result(Result result) {

        System.out.println(result.numbers().toString().replaceAll("[\\[|\\]|,]",""));
        System.out.println("count: "+result.count());
        System.out.println("distinct: "+result.distinct());
        System.out.println("min: "+result.min());
        System.out.print("max: "+result.max());
    }

    public static void printTask2result(List<List<Integer>> result){
        for (int i=0;i< result.size();i++) {
            List<Integer> pair = result.get(i);
            if(i< result.size()-1){
            System.out.println(pair.get(0)+" "+pair.get(1));
            } else {
            System.out.print(pair.get(0)+" "+pair.get(1));
            }

        }
    }




}
