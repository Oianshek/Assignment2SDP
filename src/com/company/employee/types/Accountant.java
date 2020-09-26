package com.company.employee.types;

import com.company.employee.Employee;

public class Accountant extends Employee {

    public Accountant(){

    }

    public Accountant(String name, String lastName,String position, int salary) {
        super(name, lastName,position, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" making calculations...");
    }
}
