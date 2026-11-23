package com.sandbox.v8.functional_interfaces;

import com.sandbox.v8.data.Employee;
import com.sandbox.v8.data.EmployeeDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    static BiFunction<List<Employee>, Predicate<Employee>, Map<String, Double>> biFunction =
            ((employeeList, employeePredicate) -> {
                Map<String, Double> employeeSalaryMap = new HashMap<>();
                employeeList.forEach(employee -> {
                    if (employeePredicate.test(employee)){
                        employeeSalaryMap.put(employee.getName(),employee.getSalary());
                    }
                });
                return employeeSalaryMap;
            });
    public static void main(String[] args) {
        System.out.println(biFunction.apply(EmployeeDataBase.getAllEmployees(),PredicateEmployeeExample.isLevel3OrHigher));
    }
}
