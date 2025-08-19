package com.CURD_Operations.CURD;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
public class Employee {
    private Long ID;
    private String Name;
    private String Email;
    private Long Phone;

}
