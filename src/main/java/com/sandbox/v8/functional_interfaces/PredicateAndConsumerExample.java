package com.sandbox.v8.functional_interfaces;

import com.sandbox.v8.data.Employee;
import com.sandbox.v8.data.EmployeeDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    Predicate<Employee> isLevelThreeOrHigh = (employee)-> employee.getEmployeeLevel()>=3;
    Predicate<Employee> isSalary75KOrMore = (employee)-> employee.getSalary()>=75000;
    BiConsumer<String,List<String>> employeeBiConsumer = (name,skills)-> System.out.println(name + ":" + skills);
    Consumer<Employee> employeeConsumer = ((employee)->{
        if(isLevelThreeOrHigh.and(isSalary75KOrMore).test(employee)){
            employeeBiConsumer.accept(employee.getName(), employee.getSkills());
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
