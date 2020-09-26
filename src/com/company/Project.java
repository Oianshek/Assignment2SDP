package com.company;

import com.company.departments.Department;
import com.company.departments.Development;
import com.company.departments.Finance;
import com.company.departments.HR;
import com.company.employee.EmployeeProxy;
import com.company.employee.IEmployee;

public class Project {

    Department development = new Development();
    Department finance = new Finance();
    Department hr = new HR();

    IEmployee teamLead = new EmployeeProxy("Oaziz","Seitmagambetov","Accountant",100000);
    IEmployee coworker1 = new EmployeeProxy("Ayan","Sultan","Back-end",99000);
    IEmployee coworker2 = new EmployeeProxy("Ibrahimovic","Kuanyshbay","Front-end",100000);
    IEmployee coworker3 = new EmployeeProxy("KrutoiBerik","Sapargaliev","Recruiter",100000);


    public void starter(){
        teamLead.work();

        teamLead.addCoworker(coworker1);
        teamLead.addCoworker(coworker2);
        teamLead.addCoworker(coworker3);

        for (IEmployee headEmployee : teamLead.getCoworker()) {
            headEmployee.work();
        }

        // Printing in which department works the Team Leader
        Department department =  addToDep(teamLead);
        for (IEmployee dep : department.getEmployees()) {
            System.out.println("Team Leader "+dep.getName()+" "+dep.getPosition());
        }
    }

    public Department addToDep(IEmployee iEmployee){
        switch (coworker1.getPosition()){
            case "Back-end":
            case "Front-end":
                development.addEmployee(iEmployee);
            return development;
            case "Accountant": finance.addEmployee(iEmployee);
            return finance;
            case "Recruiter": hr.addEmployee(iEmployee);
            return hr;
        }
        return null;
    }
}
