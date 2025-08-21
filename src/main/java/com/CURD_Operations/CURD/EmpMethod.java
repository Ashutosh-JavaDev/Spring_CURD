package com.CURD_Operations.CURD;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmpMethod {

    private final EmployeeDetail employeeDetail;
    public EmpMethod(EmployeeDetail employeeDetail){
        this.employeeDetail=employeeDetail;
    }
//    GetMapping
    @GetMapping("read")
    public List<Employee> readEmployee(){
   return employeeDetail.readEmployee();
    }
//    Post Mapping
    @PostMapping("add")
    public String CreateEmployee(@RequestBody Employee emp){
        return employeeDetail.CreateEmployee(emp);
    }
    @DeleteMapping("delete/{id}")
    public boolean deleteData(@PathVariable Long id){
        return employeeDetail.deleteData(id);
    }
}
