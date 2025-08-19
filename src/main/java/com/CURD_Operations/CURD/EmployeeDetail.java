package com.CURD_Operations.CURD;
import org.springframework.stereotype.Component;

import java.util.List;

 public interface EmployeeDetail {
       String CreateEmployee(Employee emp);
       List<Employee>readEmployee();
       boolean deleteData(Long id);
 }
