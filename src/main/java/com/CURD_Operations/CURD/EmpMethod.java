package com.CURD_Operations.CURD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpMethod extends Employee {
    @GetMapping("/Empl")
    public List<Employee> getDetail(Employee emp){


    }
}
