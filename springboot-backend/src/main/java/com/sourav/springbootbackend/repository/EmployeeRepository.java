package com.sourav.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sourav.springbootbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>  {

}
