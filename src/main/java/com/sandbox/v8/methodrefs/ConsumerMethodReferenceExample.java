package com.sandbox.v8.methodrefs;

import com.sandbox.v8.data.Employee;
import com.sandbox.v8.data.EmployeeDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    static Consumer<Employee> employeeConsumer = System.out::println;
    static Consumer<Employee> employeeSkillsPrinter = Employee::printListOfSkills;

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();
        employeeList.forEach(employeeConsumer);
        System.out.println("***********************");
        employeeList.forEach(employeeSkillsPrinter);
    }
}
