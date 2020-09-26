package com.company.employee.types;

import com.company.employee.Employee;

public class BackEndDeveloper extends Employee {

    public BackEndDeveloper() {
    }

    public BackEndDeveloper(String name, String lastName, String position, int salary) {
        super(name, lastName, position,salary);
    }

    @Override
    public void work() {
        System.out.println(super.getName()+" writing Java code...");
    }
}
