package com.sandbox.v8.functional_interfaces;

import com.sandbox.v8.data.Employee;
import com.sandbox.v8.data.EmployeeDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionEmployeeExample {
    static Function<List<Employee>, Map<String, Double>> employeeMapper = (employees -> {
        Map<String, Double> employeeSalaryMap = new HashMap<>();
            employees.forEach((employee)-> {
                if(PredicateEmployeeExample.isLevel3OrHigher.test(employee)) {
                    employeeSalaryMap.put(employee.getName(), employee.getSalary());
                }
            });
        return employeeSalaryMap;
    });
    public static void main(String[] args) {
        System.out.println(employeeMapper.apply(EmployeeDataBase.getAllEmployees()));
    }
}
