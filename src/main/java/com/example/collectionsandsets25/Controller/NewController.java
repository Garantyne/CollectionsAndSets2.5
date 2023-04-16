package com.example.collectionsandsets25.Controller;

import java.util.List;
import java.util.Map;

import com.example.collectionsandsets25.model.Employee;
import com.example.collectionsandsets25.service.NewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/departments")
public class NewController {

    private final NewService newService;

    public NewController(NewService newService) {
        this.newService = newService;
    }

    @GetMapping("/max-salary")
    public Employee findEmployeeWithMaxSalaryFromDepartment(
            @RequestParam("departmentId") int department) {
        return newService.findEmployeeWithMaxSalaryFromDepartment(department);
    }

    @GetMapping("/min-salary")
    public Employee findEmployeeWithMinSalaryFromDepartment(
            @RequestParam("departmentId") int department) {
        return newService.findEmployeeWithMinSalaryFromDepartment(department);
    }

    @GetMapping(value = "/all", params = "departmentId")
    public List<Employee> findEmployeesFromDepartment(@RequestParam("departmentId") int department) {
        return newService.findAllEmployeesFromDepartment(department);
    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> findEmployees() {
        return newService.findEmployeesByDepartment();
    }

}