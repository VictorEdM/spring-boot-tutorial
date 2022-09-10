package com.youtube.dailycodebuffer.tutorial.services;

import com.youtube.dailycodebuffer.tutorial.entities.Department;
import com.youtube.dailycodebuffer.tutorial.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findByIdDepartment(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public Department deleteByIdDepartment(Long id) {
        Department department = findByIdDepartment(id);
        departmentRepository.deleteById(id);
        return department;
    }

    @Override
    public Department updateByIdDepartment(Long id, Department department) {
        Department updatedDepartment = departmentRepository.findById(id).get();
        if (Objects.nonNull(department.getName()) && !department.getName().equals("")) {
            updatedDepartment.setName(department.getName());
        }

        if (Objects.nonNull(department.getAddress()) && !department.getAddress().equals("")) {
            updatedDepartment.setAddress(department.getAddress());
        }

        if (Objects.nonNull(department.getCode()) && !department.getCode().equals("")) {
            updatedDepartment.setCode(department.getCode());
        }

        return departmentRepository.save(updatedDepartment);
    }

    @Override
    public Department findByNameDepartment(String name) {
        return departmentRepository.findByNameIgnoreCase(name);
    }

}
