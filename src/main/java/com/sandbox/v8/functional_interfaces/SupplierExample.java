package com.sandbox.v8.functional_interfaces;

import com.sandbox.v8.data.Employee;
import com.sandbox.v8.data.EmployeeDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        //Supplier does NOT take any input.
        Supplier<Employee> employeeSupplier = () -> {
            return new Employee(
                    "Michael",
                    4,
                    80000,
                    "Sales",
                    Arrays.asList(
                            "Communication",
                            "Marketing",
                            "New Markets"));
        };
        System.out.println("Employee is : " + employeeSupplier.get());

        Supplier<List<Employee>> employeeListSupplier = () -> {
          return EmployeeDataBase.getAllEmployees();
        };
        System.out.println("Employee List : " + employeeListSupplier.get());
    }
}
