package com.company.employee;

import java.util.List;

public interface IEmployee {
    void work();
    void addCoworker(IEmployee employee);
    void removeCoworker(IEmployee employee);
    List<IEmployee> getCoworker();
    String getPosition();
    String getName();
}
