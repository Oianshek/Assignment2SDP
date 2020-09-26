package com.company.departments;

import com.company.employee.IEmployee;

import java.util.ArrayList;
import java.util.List;

abstract public class Department {

    protected List<IEmployee> employees;

    public Department(){
        employees = new ArrayList<>();
    }

    public void addEmployee(IEmployee employee){
        employees.add(employee);
    }

    public List<IEmployee> getEmployees(){
        return employees;
    }
}
