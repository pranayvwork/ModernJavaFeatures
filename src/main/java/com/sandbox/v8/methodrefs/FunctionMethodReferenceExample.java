package com.sandbox.v8.methodrefs;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String,String>  toUpperCaseLambda = (s) -> s.toUpperCase();
    static Function<String,String>  toUpperCaseUsingMethodRef = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("java 8"));
        System.out.println(toUpperCaseUsingMethodRef.apply("java 8"));
    }
}
