package com.CURD_Operations.CURD;

import org.hibernate.annotations.DynamicUpdate;
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
//    Delete Mapping
    @DeleteMapping("delete/{id}")
    public boolean deleteData(@PathVariable Long id){
        return employeeDetail.deleteData(id);
    }
    @PutMapping ("Update{id}")
    public Employee updatedData(Long id,Employee updateData){
        return employeeDetail.updateData(id,updateData);
    }
}
