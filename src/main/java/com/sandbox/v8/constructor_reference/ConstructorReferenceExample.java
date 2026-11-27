package com.sandbox.v8.constructor_reference;

import com.sandbox.v8.data.Employee;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    // Constructor Reference. Employee must have an empty constructor.
    static Supplier<Employee> employeeSupplier = Employee::new;
    //employeeFunction takes an input string, output Employee object.
    static Function<String, Employee> employeeFunction = Employee::new;
    public static void main(String[] args) {
        //Prints an Empty Employee Object
        System.out.println(employeeSupplier.get());
        System.out.println(employeeFunction.apply("Kelly"));
    }
}
