package com.company.employee.types;

import com.company.employee.Employee;

public class FrontEndDeveloper extends Employee {

    public FrontEndDeveloper() {
    }

    public FrontEndDeveloper(String name, String lastName,String position, int salary) {
        super(name, lastName, position,salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" writing JavaScript code...");
    }
}
