package com.vaishnavi.guardianapp;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {// Added new feature branch change
    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/test")
    public String testApi() {
        return "Feature branch working";
    }

    // CREATE
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    // READ ALL
    @GetMapping
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
