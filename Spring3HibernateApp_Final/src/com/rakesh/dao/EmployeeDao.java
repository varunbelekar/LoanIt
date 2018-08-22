package com.rakesh.dao;

import java.util.List;

import com.rakesh.model.Employee;

/**
 * @author Rakesh Srivastava
 *
 */
public interface EmployeeDao {
	
	public void addEmployee(Employee employee) throws Exception;

	public List<Employee> listEmployeess() throws Exception;
	
	public Employee getEmployee(int empid) throws Exception;
	
	public void deleteEmployee(Employee employee) throws Exception;
}
