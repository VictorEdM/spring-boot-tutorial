package com.youtube.dailycodebuffer.tutorial.services;

import com.youtube.dailycodebuffer.tutorial.entities.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> findAllDepartments();

    Department findByIdDepartment(Long id);

    Department deleteByIdDepartment(Long id);

    Department updateByIdDepartment(Long id, Department department);

    Department findByNameDepartment(String name);
}
