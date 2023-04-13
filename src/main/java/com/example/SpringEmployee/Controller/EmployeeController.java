package com.example.SpringEmployee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringEmployee.Model.Employee;
import com.example.SpringEmployee.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService empservice;
	
	@RequestMapping(value="/employees", method=RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee emp)
	{
		return empservice.createEmployee(emp);
	}
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	public List<Employee> getEmployees()
	{
		return empservice.getEmployees();
}
	@RequestMapping(value="/employees/{empId}",method=RequestMethod.DELETE)

	public void deleteEmployee(@PathVariable(value="empId") Integer id)
	{
		empservice.deleteEmployee(id);
}
	@RequestMapping(value="/emplyees/{empId}",method=RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable(value="empId")Integer id,@RequestBody Employee empdet)
	{
		return empservice.updateEmployee(id, empdet);
		
	}
	}
