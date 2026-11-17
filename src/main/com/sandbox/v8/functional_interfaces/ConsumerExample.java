package main.com.sandbox.v8.functional_interfaces;

import main.com.sandbox.v8.data.Employee;
import main.com.sandbox.v8.data.EmployeeDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Employee> showEmployeeDetails = (employee) -> System.out.println(employee);
    static Consumer<Employee> showEmployeeName = (employee) -> System.out.print(employee.getName());
    static Consumer<Employee> showEmployeeSkills = (employee) -> System.out.println(employee.getSkills());
    public static void printEmployees(){
        System.out.println("*** printEmployees ***");
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();
        employeeList.forEach(showEmployeeDetails);
    }
    public static void printEmployeeNameAndSkills(){
        System.out.println("**** printEmployeeNameAndSkills ***");
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();
        employeeList.forEach(showEmployeeName.andThen(showEmployeeSkills)); //consumer chaining
    }

    public static void printEmployeeNameAndSkillsUsingCondition(){
        System.out.println("*** printEmployeeNameAndSkillsUsingCondition ***");
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();
        //conditional processing
        employeeList.forEach((employee -> {
            if(employee.getEmployeeLevel() >= 3){
                showEmployeeName.andThen(showEmployeeSkills).accept(employee);
            }
        }));
    }

    public static void main(String[] args) {
        // Simple consumer example
        Consumer<String> displayUpperCase  =  (s)-> System.out.println(s.toUpperCase());
        displayUpperCase.accept("Java 8 Features");
        // Demonstrates basic consumer when a list is given
        printEmployees();
        //Demonstrates Consumer Chaining
        printEmployeeNameAndSkills();
        //Demonstrates consumer chaining with conditional processing
        printEmployeeNameAndSkillsUsingCondition();
    }
}
