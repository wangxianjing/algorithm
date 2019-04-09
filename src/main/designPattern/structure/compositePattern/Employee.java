package main.designPattern.structure.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wong on 2019/4/8.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;

    List<Employee> subEmployees;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subEmployees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        subEmployees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        subEmployees.remove(employee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subEmployees=" + subEmployees +
                '}';
    }
}
