package com.CURD_Operations.CURD;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService implements EmployeeDetail {
   private final List<Employee>employee=new ArrayList();
    @Override
    public String CreateEmployee(Employee emp){
    employee.add(emp);
    return  "Data Added Successfully";
    }
    @Override
    public List<Employee>readEmployee(){
        return employee;
    }
    @Override
    public boolean deleteData(Long id){
        return employee.removeIf(e -> e.getID().equals(id));
    }
    @Override
    public boolean updateData(Long id){

    }
}
