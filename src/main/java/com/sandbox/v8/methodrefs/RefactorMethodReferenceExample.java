package com.sandbox.v8.methodrefs;

import com.sandbox.v8.data.Employee;
import com.sandbox.v8.data.EmployeeDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    static Predicate<Employee> isEmployeeLevel3OrHigh = RefactorMethodReferenceExample::greaterThanLevel;

    public static boolean greaterThanLevel(Employee e){
        return e.getSalary() >= 3;
    }
    public static void main(String[] args) {
        System.out.println(isEmployeeLevel3OrHigh.test(EmployeeDataBase.employeeSupplier.get()));
    }
}
