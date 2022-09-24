package com.org.tcs.controller;

import com.org.tcs.model.Employee;
import com.org.tcs.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    EmpService empService;
    @PostMapping("/add")
    public void addEmp(@RequestBody Employee employee){
    empService.addEmp(employee);
    }
}
