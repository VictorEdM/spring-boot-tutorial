package com.youtube.dailycodebuffer.tutorial.controllers;

import com.youtube.dailycodebuffer.tutorial.entities.Department;
import com.youtube.dailycodebuffer.tutorial.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department save(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping
    public List<Department> findAll() {
        return departmentService.findAllDepartments();
    }

    @GetMapping(value = "/{id}")
    public Department findById(@PathVariable Long id) {
        Department department = departmentService.findByIdDepartment(id);
        System.out.println(department);
        return department;
    }

    @DeleteMapping(value = "/{id}")
    public Department deleteById(@PathVariable Long id) {
        Department department = departmentService.deleteByIdDepartment(id);
        System.out.println(department);
        return department;
    }

    @PutMapping(value = "/{id}")
    public Department updateById(@PathVariable Long id, @RequestBody Department department) {
        Department updatedDepartment = departmentService.updateByIdDepartment(id, department);
        return updatedDepartment;
    }

    @GetMapping(value = "/name/{name}")
    public Department findByName(@PathVariable String name) {
        return departmentService.findByNameDepartment(name);
    }
}
