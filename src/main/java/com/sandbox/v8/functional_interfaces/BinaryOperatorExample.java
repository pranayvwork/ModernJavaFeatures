package com.sandbox.v8.functional_interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    //BinaryOperator<T> extends BiFunction<T, T, T>
    //both inputs and the return value must be the same type
    //Use BinaryOperator when folding, aggregating, or resolving conflicts between two values of the same type

    static Comparator<Integer> comparator = (a,b)-> a.compareTo(b);
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
        System.out.println(binaryOperator.apply(3,4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Result of maxBy : " + maxBy.apply(4,5));

        BinaryOperator<Integer> minBy  = BinaryOperator.minBy(comparator);
        System.out.println("Result of minBy:" + minBy.apply(10,12));
    }
}
