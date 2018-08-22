package com.rakesh.service;

import java.util.List;

import com.rakesh.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee) throws Exception;

	public List<Employee> listEmployeess() throws Exception;
	
	public Employee getEmployee(int empid) throws Exception;
	
	public void deleteEmployee(Employee employee) throws Exception;
}
