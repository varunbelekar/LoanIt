package com.rakesh.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.rakesh.bean.EmployeeBean;
import com.rakesh.model.Employee;
import com.rakesh.service.EmployeeService;
/**
 * @author Rakesh Srivastava
 *
 */
@Controller
@SessionAttributes("thought")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") EmployeeBean employeeBean, 
			BindingResult result) {
		Employee employee = prepareModel(employeeBean);
		try
		{
			employeeService.addEmployee(employee);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return new ModelAndView("redirect:/add.html");
	}

	@RequestMapping(value="/employees", method = RequestMethod.GET)
	public ModelAndView listEmployees() {
		Map<String, Object> model = new HashMap<String, Object>();
		try
		{
			model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return new ModelAndView("employeesList", model);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addEmployee(@ModelAttribute("command")  EmployeeBean employeeBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		try
		{
			model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return new ModelAndView("addEmployee", model);
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("redirect:/index.jsp");
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView editEmployee(@ModelAttribute("command")  EmployeeBean employeeBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		try
		{
			employeeService.deleteEmployee(prepareModel(employeeBean));
			model.put("employee", null);
			model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return new ModelAndView("addEmployee", model);
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@ModelAttribute("command")  EmployeeBean employeeBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		try
		{
			model.put("employee", prepareEmployeeBean(employeeService.getEmployee(employeeBean.getId())));
			model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return new ModelAndView("addEmployee", model);
	}
	
	@RequestMapping(value="/remember") 
    public ModelAndView rememberThought(@RequestParam String thoughtParam) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("thought", thoughtParam);
        modelAndView.setViewName("session-page");
        return modelAndView;
    }
	
	private Employee prepareModel(EmployeeBean employeeBean){
		Employee employee = new Employee();
		employee.setEmpAddress(employeeBean.getAddress());
		employee.setEmpAge(employeeBean.getAge());
		employee.setEmpName(employeeBean.getName());
		employee.setSalary(employeeBean.getSalary());
		employee.setEmpId(employeeBean.getId());
		return employee;
	}
	
	private List<EmployeeBean> prepareListofBean(List<Employee> employees){
		List<EmployeeBean> beans = null;
		if(employees != null && !employees.isEmpty()){
			beans = new ArrayList<EmployeeBean>();
			EmployeeBean bean = null;
			for(Employee employee : employees){
				bean = new EmployeeBean();
				bean.setName(employee.getEmpName());
				bean.setId(employee.getEmpId());
				bean.setAddress(employee.getEmpAddress());
				bean.setSalary(employee.getSalary());
				bean.setAge(employee.getEmpAge());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private EmployeeBean prepareEmployeeBean(Employee employee){
		EmployeeBean bean = new EmployeeBean();
		bean.setAddress(employee.getEmpAddress());
		bean.setAge(employee.getEmpAge());
		bean.setName(employee.getEmpName());
		bean.setSalary(employee.getSalary());
		bean.setId(employee.getEmpId());
		return bean;
	}
}
