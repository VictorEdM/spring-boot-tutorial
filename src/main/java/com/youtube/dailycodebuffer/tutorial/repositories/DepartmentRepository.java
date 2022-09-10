package com.youtube.dailycodebuffer.tutorial.repositories;

import com.youtube.dailycodebuffer.tutorial.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
