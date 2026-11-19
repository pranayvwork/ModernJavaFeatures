package com.sandbox.v8.functional_interfaces;

import com.sandbox.v8.data.Employee;
import com.sandbox.v8.data.EmployeeDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateEmployeeExample {
    static Predicate<Employee> isLevel3OrHigher = (e)-> e.getEmployeeLevel()>=3;
    static Predicate<Employee> isSalary75KOrMore = (e)-> e.getSalary()>=75000;
    public static void filterEmployeeByLevel(){
        System.out.println("**** filterEmployeeByLevel ****");
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();
        employeeList.forEach((employee -> {
          if(isLevel3OrHigher.test(employee)){
              System.out.println(employee);
          }
        }));
    }
    public static void filterEmployeeBySalary(){
        System.out.println("**** filterEmployeeBySalary ****");
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();
        employeeList.forEach((employee -> {
            if(isSalary75KOrMore.test(employee)){
                System.out.println(employee);
            }
        }));
    }
    public static void filterEmployees(){
        System.out.println("**** filter employees MISC ****");
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();
        employeeList.forEach((employee -> {
            //Print Employees who are NOT  Level >=3  AND NOT having salary >= 75K
            // isJuniorAndLowPaid
            if((isLevel3OrHigher.negate().and(isSalary75KOrMore.negate())).test(employee)){
                System.out.println(employee);
            }
        }));
    }
    public static void main(String[] args) {
        filterEmployeeByLevel();
        filterEmployeeBySalary();
        filterEmployees();
    }
}
