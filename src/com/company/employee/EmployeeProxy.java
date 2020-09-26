package com.company.employee;

import com.company.employee.types.Accountant;
import com.company.employee.types.BackEndDeveloper;
import com.company.employee.types.FrontEndDeveloper;
import com.company.employee.types.Recruiter;

import java.util.List;

public class EmployeeProxy implements IEmployee {
    Employee employee;

    public EmployeeProxy(){

    }

    public EmployeeProxy(String name, String lastName, String position, int salary) {

        employee = checker(position);

        employee.setName(name);
        employee.setLastName(lastName);
        employee.setPosition(position);
        employee.setSalary(salary);
    }

    public Employee checker(String position){
        switch (position){
            case "Back-end": return new BackEndDeveloper();
            case "Front-end": return new FrontEndDeveloper();
            case "Accountant": return new Accountant();
            case "Recruiter": return new Recruiter();
        }
        return null;
    }

    @Override
    public void work() {
        if(employee != null){
            employee.work();
        }
    }

    @Override
    public void addCoworker(IEmployee employee) {
        if(this.employee != null){
            this.employee.addCoworker(employee);
        }
    }

    @Override
    public void removeCoworker(IEmployee employee) {
        if(this.employee != null){
            this.employee.removeCoworker(employee);
        }
    }

    @Override
    public List<IEmployee> getCoworker() {
        if(employee != null){
           return employee.getCoworker();
        }
        return null;
    }

    @Override
    public String getPosition() {
        return employee.getPosition();
    }

    @Override
    public String getName() {
        return employee.getName();
    }

}
