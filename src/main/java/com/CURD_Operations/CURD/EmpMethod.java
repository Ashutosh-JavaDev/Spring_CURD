package com.CURD_Operations.CURD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmpMethod {

    private final EmployeeDetail employeeDetail;
    public EmpMethod(EmployeeDetail employeeDetail){
        this.employeeDetail=employeeDetail;
    }
    @GetMapping("read")
    public List<Employee> readEmployee(){
   return employeeDetail.readEmployee();
    }
    @PostMapping("add")
    public String CreateEmployee(@RequestBody Employee emp){
        return employeeDetail.CreateEmployee(emp);
    }
    @DeleteMapping("delete/{id}")
    public boolean deleteData(@PathVariable Long id){
        return employeeDetail.deleteData(id);
    }
}
