package com.example.workload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

@GetMapping("/")
public String getForm(){
    return "employeeForm";
}

}
