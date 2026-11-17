package main.com.sandbox.v8.data;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private int employeeLevel;
    private double salary;
    private String department;

    List<String> skills = new ArrayList<>();

    public Employee(String name,
                    int employeeLevel,
                    double salary,
                    String department,
                    List<String> skills) {
        this.name = name;
        this.employeeLevel = employeeLevel;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(int employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeLevel=" + employeeLevel +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", skills=" + skills +
                '}';
    }
}