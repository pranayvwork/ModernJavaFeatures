package com.sandbox.v8.functional_interfaces;

import com.sandbox.v8.data.Employee;
import com.sandbox.v8.data.EmployeeDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void printEmployeeNameAndActivities(){
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();
        BiConsumer displayEmployeeNameAndSkills = (name,skills) -> System.out.println(name + ": " + skills );
        employeeList.forEach(employee -> displayEmployeeNameAndSkills.accept(employee.getName(), employee.getSkills()) );
    }
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a, b)-> {
            System.out.println("a:" + a + " b:" + b);
        };
        biConsumer.accept("java 7", "java 8");

        BiConsumer<Integer,Integer> multiply = (a,b) -> {
            System.out.println("Multiplication is : " + (a * b));
        };
        BiConsumer<Integer,Integer> division = (a,b) -> {
            System.out.println("Division is : " + (a / b));
        };

        multiply.andThen(division).accept(12,2);
        printEmployeeNameAndActivities();
    }
}
