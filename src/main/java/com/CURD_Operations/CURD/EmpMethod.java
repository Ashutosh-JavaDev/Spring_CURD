package com.CURD_Operations.CURD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpMethod implements EmployeeDetail {

    @Override
    public String getData(){
        return "ok";
    }
@Override
public String Data() {
        return "Done from  Interface";
    }
    List<Employee>emp=new ArrayList<>();
    @GetMapping("Empl")
    public List<Employee> getDetail(){
   return emp;
    }
    @PostMapping("emp")
    public String getInfo(@RequestBody Employee emps){
        emp.add(emps);
        return "Successfully Inserted";
    }
}
