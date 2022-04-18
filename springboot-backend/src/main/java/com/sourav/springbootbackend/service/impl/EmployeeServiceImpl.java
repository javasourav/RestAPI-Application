package com.sourav.springbootbackend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sourav.springbootbackend.exception.ResourceNotFoundException;
import com.sourav.springbootbackend.model.Employee;
import com.sourav.springbootbackend.repository.EmployeeRepository;
import com.sourav.springbootbackend.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;
	

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee","id",id));
	}


	@Override
	public Employee updateEmployee(Employee employee, long id) {
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee","id",id));
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		employeeRepository.save(existingEmployee);
		return existingEmployee;
		
	}


	@Override
	public void deleteEmployee(long id) {
		
		employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee","id",id));
		employeeRepository.deleteById(id);
		
	}
	


	


	
	}


