package com.example.hbreck.EmployeeManagement.repository;

import com.example.hbreck.EmployeeManagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
