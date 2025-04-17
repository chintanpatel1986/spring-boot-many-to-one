package com.excellence.manytoone.service;

import com.excellence.manytoone.model.Department;

import java.util.List;

public interface DepartmentService {

    void addDepartment(Department department);

    List<Department>getAllDepartmentList();

    Department getDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);
}
