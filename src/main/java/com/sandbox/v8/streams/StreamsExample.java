package com.sandbox.v8.streams;

import com.sandbox.v8.data.Employee;
import com.sandbox.v8.data.EmployeeDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    static Predicate<Employee> isEmployeeLevelThreeOrHigh = employee -> employee.getEmployeeLevel() >=3;
    static Predicate<Employee> isEmployeeWellPaid = employee -> employee.getSalary() >=75000;
    public static void main(String[] args) {
        //employee name and skills in a map
        Map<String, List<String>> employeeMap =  EmployeeDataBase.getAllEmployees().stream()
                .filter(isEmployeeLevelThreeOrHigh)
                .filter(isEmployeeWellPaid)
                .collect(Collectors.toMap(Employee::getName, Employee::getSkills));
        System.out.println(employeeMap);
    }
}
