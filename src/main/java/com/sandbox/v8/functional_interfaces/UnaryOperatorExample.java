package com.sandbox.v8.functional_interfaces;

import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    //When input and output both are of same type, then use UnaryOperator
        static UnaryOperator<String> sanitizeInput = s -> s.trim().toLowerCase();
        static UnaryOperator<Double> applyDiscount = price -> price * 0.90;
        static UnaryOperator<Double> addTax = price -> price * 1.18;

        //When working with numbers in high-throughput loops, Java provides primitive counterparts
        // IntUnaryOperator, LongUnaryOperator, DoubleUnaryOperator) that avoid int to Integer autoboxing overhead
        static DoubleUnaryOperator addBonus = amount -> amount * 1.45;

        public static void main(String[] args) {
            System.out.println(sanitizeInput.apply(" MICHAELSCOTT@dundermifflin.com  "));
            System.out.println("Final Price:" + applyDiscount.andThen(addTax).apply(100.0));
            System.out.println("Bonus:" + addBonus.applyAsDouble(80.0) );
    }
}
