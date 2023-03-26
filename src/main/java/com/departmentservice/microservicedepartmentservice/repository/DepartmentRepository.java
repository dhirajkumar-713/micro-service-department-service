package com.departmentservice.microservicedepartmentservice.repository;

import com.departmentservice.microservicedepartmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
