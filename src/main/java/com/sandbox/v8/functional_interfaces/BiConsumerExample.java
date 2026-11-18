package com.sandbox.v8.functional_interfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a, b)-> {
            System.out.println("a:" + a + " b:" + b);
        };
        biConsumer.accept("java 7", "java 8");
    }
}
