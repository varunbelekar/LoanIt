package com.rakesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rakesh.dao.EmployeeDao;
import com.rakesh.model.Employee;

@Service("employeeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}


	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addEmployee(Employee employee) throws Exception {
		employeeDao.addEmployee(employee);
		
	}

	
	public List<Employee> listEmployeess() throws Exception {
		
			return employeeDao.listEmployeess();
		
	}

	
	public Employee getEmployee(int empid) throws Exception {
		return employeeDao.getEmployee(empid);
		
	}

	
	public void deleteEmployee(Employee employee) throws Exception {
		 employeeDao.deleteEmployee(employee);
		
	}

}
