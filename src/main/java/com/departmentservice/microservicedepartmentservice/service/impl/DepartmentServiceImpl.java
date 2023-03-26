package com.departmentservice.microservicedepartmentservice.service.impl;

import com.departmentservice.microservicedepartmentservice.entity.Department;
import com.departmentservice.microservicedepartmentservice.repository.DepartmentRepository;
import com.departmentservice.microservicedepartmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}
