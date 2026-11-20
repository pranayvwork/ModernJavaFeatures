package com.sandbox.v8.functional_interfaces;

import com.sandbox.v8.data.Employee;
import com.sandbox.v8.data.EmployeeDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    Predicate<Employee> isLevelThreeOrHigh = (employee)-> employee.getEmployeeLevel()>=3;
    Predicate<Employee> isSalary75KOrMore = (employee)-> employee.getSalary()>=75000;

    BiPredicate<Integer, Double> isSeniorAndWellPaid = (level, salary) -> level>=3 && salary >=75000;
    BiConsumer<String,List<String>> showEmployeeNameAndSkills = (name,skills)-> System.out.println(name + ":" + skills);
    Consumer<Employee> employeeConsumer = ((employee)->{
        //Using two predicates to test if condition
        //if(isLevelThreeOrHigh.and(isSalary75KOrMore).test(employee)){
        //Using BiPredicate isSeniorAndWellPaid to test if condition
        if(isSeniorAndWellPaid.test(employee.getEmployeeLevel(), employee.getSalary())){
            showEmployeeNameAndSkills.accept(employee.getName(), employee.getSkills());
        }
    });
    public void printNameAndSkills(List<Employee> employees){
        employees.forEach(employeeConsumer);
    }
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();
        new PredicateAndConsumerExample().printNameAndSkills(employeeList);
    }
}
