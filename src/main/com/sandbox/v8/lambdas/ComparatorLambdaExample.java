package main.com.sandbox.v8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         * Before Java 8
         *
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> o1 == o2, 1 -> o1 > o2, -1 -> o1 < o2
            }
        };
        int result = comparator.compare(3,2);
        System.out.println("comparator result:" + result);

        /**
         * Modern Java 8 : Lambda way
         */
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) ->  a.compareTo(b);
        //Also works fine - when there is no mention of the Integer Type when invoking
        //Comparator<Integer> comparatorLambda = (a,b) ->  a.compareTo(b);
        System.out.println("Result of comparatorLambda:" + comparatorLambda.compare(3,2));


    }
}
