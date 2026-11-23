package com.sandbox.v8.functional_interfaces;

import java.util.function.Function;

public class FunctionExample {
    static Function<String,String> performUpperCase = (name) -> name.toUpperCase();
    static Function<String,String> performLowerCase = (name) -> name.toLowerCase();
    static Function<String,String> addSomeString = (name) -> name.concat("default");


    public static void main(String[] args) {
        System.out.println("Result is : " + performUpperCase.apply("java 8"));
        // f.andThen(g) = f runs FIRST, then g runs on f's result (Left-to-Right)
        String andThenResult = performUpperCase.andThen(performLowerCase).apply("Java 8");
        System.out.println("Result of andThen is : " + andThenResult);
        // f.compose(g) = g runs FIRST, then f runs on g's result (Right-to-Left)
        String composeResult = performUpperCase.compose(performLowerCase).apply("Java 8");
        System.out.println("Result of compose is : " + composeResult);
        String result = performConcat("Hello");
        System.out.println("Result of performConcat is : " + result);
    }

    public static String performConcat(String str){
        return FunctionExample.addSomeString.apply(str);
    }
}
