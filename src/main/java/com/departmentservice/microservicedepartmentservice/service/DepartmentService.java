package com.departmentservice.microservicedepartmentservice.service;

import com.departmentservice.microservicedepartmentservice.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
}
