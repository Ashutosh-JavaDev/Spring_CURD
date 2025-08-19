package com.CURD_Operations.CURD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpMethod {
    @Autowired
    private EmployeeDetail employeeDetail;


    @GetMapping("read")
    public List<Employee> readEmployee(){
   return employeeDetail.readEmployee();
    }
    @PostMapping("label")
    public String CreateEmployee(@RequestBody Employee emp){
        return employeeDetail.CreateEmployee(emp);
    }
    @DeleteMapping("delete/{id}")
    public boolean deleteData(@PathVariable Long id){
        return employeeDetail.deleteData(id);
    }
}
