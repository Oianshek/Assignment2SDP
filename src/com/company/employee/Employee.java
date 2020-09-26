package com.company.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee implements IEmployee {
    String name;
    String lastName;
    String position;
    int salary;
    List<IEmployee> coworkers;

    public Employee(){
        coworkers = new ArrayList<IEmployee>();
    }

    public Employee(String name, String lastName,String position, int salary) {
        this();
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void addCoworker(IEmployee employee) {
        coworkers.add(employee);
    }

    public void removeCoworker(IEmployee employee){
        coworkers.remove(employee);
    }

    @Override
    public List<IEmployee> getCoworker() {
        return coworkers;
    }


    @Override
    public void work() {

    }

}
