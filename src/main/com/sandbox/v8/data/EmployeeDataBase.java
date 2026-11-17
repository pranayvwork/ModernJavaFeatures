package main.com.sandbox.v8.data;

import java.util.Arrays;
import java.util.List;

public class EmployeeDataBase {

    /**
     * Total of 6 employees in the database.
     * @return
     */
    public static List<Employee> getAllEmployees() {

        /**
         * Level 2 employees
         */
        Employee employee1 = new Employee(
                "Adam",
                2,
                65000,
                "Engineering",
                Arrays.asList(
                        "Communication",
                        "Java Programming",
                        "System Design"));

        Employee employee2 = new Employee(
                "Jenny",
                2,
                75000,
                "Testing",
                Arrays.asList(
                        "Communication",
                        "Java Programming",
                        "Problem Solving"));

        /**
         * Level 3 employees
         */
        Employee employee3 = new Employee(
                "Emily",
                3,
                90000,
                "Engineering",
                Arrays.asList(
                        "Communication",
                        "Java Programming",
                        "Spots typos"));

        Employee employee4 = new Employee(
                "Dave",
                3,
                85000,
                "Engineering",
                Arrays.asList(
                        "Communication",
                        "Leadership",
                        "Problem Solving"));

        /**
         * Level 4 employees
         */
        Employee employee5 = new Employee(
                "Sophia",
                4,
                70000,
                "Product",
                Arrays.asList(
                        "Communication",
                        "Leadership",
                        "System Design"));

        Employee employee6 = new Employee(
                "James",
                4,
                85000,
                "Architecture",
                Arrays.asList(
                        "Communication",
                        "Testing",
                        "System Design"));

        List<Employee> employees = Arrays.asList(
                employee1,
                employee2,
                employee3,
                employee4,
                employee5,
                employee6
        );

        return employees;
    }
}