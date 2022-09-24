package com.org.tcs.service;

import com.org.tcs.model.Employee;
import com.org.tcs.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public void addEmp(Employee employee) {
        employeeRepo.save(employee);
    }
}
