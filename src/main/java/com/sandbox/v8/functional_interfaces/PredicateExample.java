package com.sandbox.v8.functional_interfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p = (i)->{ return i%2 == 0; };
    //Can be written in single line expression statement as well
    static Predicate<Integer> isDivisibleBy2 = (i) -> i%2==0;
    static Predicate<Integer> isDivisibleBy5 = (i) -> i%5==0;
    public static void predicateAnd(){
        int developersOnCall  = 10;
        int sleepyAndYawningFolks = 9;
        System.out.println("**** predicateAnd ****");
        System.out.print("is developersOnCall count:"+ developersOnCall  + " divisible by 2 AND 5:");
        System.out.println(isDivisibleBy2.and(isDivisibleBy5).test(developersOnCall)); //predicate chaining
        System.out.print("is sleepyAndYawningFolks count:"+ sleepyAndYawningFolks  + " divisible by 2 AND 5:");
        System.out.println(isDivisibleBy2.and(isDivisibleBy5).test(sleepyAndYawningFolks));
    }
    public static void predicateOr(){
        int coffeeRefillTrips = 10;
        int chitChatsDone = 9;
        System.out.println("**** predicateOr ****");
        System.out.print("Is coffeeRefillTrips:"+ coffeeRefillTrips + " divisible by 2 OR 5:");
        System.out.println(isDivisibleBy2.or(isDivisibleBy5).test(coffeeRefillTrips)); //predicate chaining
        System.out.print("Is chitChatsDone:"+ chitChatsDone + " divisible by 2 OR 5:");
        System.out.println(isDivisibleBy2.or(isDivisibleBy5).test(chitChatsDone));
    }

    public static void predicateNegate(){
        int bugFixesSolved = 8;
        System.out.println("**** predicateNegate ****");
        System.out.print("Bug fixes solved?");
        System.out.println(isDivisibleBy2.or(isDivisibleBy5).negate().test(bugFixesSolved));
    }
    public static void main(String[] args) {
        int scoreOne = 4;
        System.out.println(p.test(scoreOne));
        System.out.println(isDivisibleBy2.test(scoreOne));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
