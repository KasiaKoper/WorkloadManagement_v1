package com.example.workload.controller;


import com.example.workload.model.Employee;
import com.example.workload.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
//@RequestMapping("/actions")
public class MainController {

//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @GetMapping(path="/add")
//    public @ResponseBody
//    String addNewEmployee (@RequestParam String name,
//                                                @RequestParam String surname,
//                                                @RequestParam String role,
//                                                @RequestParam int capacity){
//        Employee employee=new Employee();
//        employee.setName(name);
//        employee.setSurname(surname);
//        employee.setCapacity(capacity);
//        employee.setRole(role);
//
//        employeeRepository.save(employee);
//
//        return "Saved";
//
//    }
//
//    @GetMapping(path = "/employees")
//    public @ResponseBody
//    Iterable<Employee> getAllEmployees(){
//        return employeeRepository.findAll();
//    }


}
