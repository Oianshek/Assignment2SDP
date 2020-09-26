package com.company.employee.types;

import com.company.employee.Employee;

public class Recruiter extends Employee {

    public Recruiter() {

    }

    public Recruiter(String name, String lastName, String position,int salary) {
        super(name, lastName, position,salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" recruiting someone...");
    }
}
