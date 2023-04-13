package com.example.SpringEmployee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringEmployee.Model.Employee;
import com.example.SpringEmployee.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository emprepository;
	public Employee createEmployee(Employee emp)
	{
		return emprepository.save(emp);
	}
	public List<Employee> getEmployees()
	{
		return emprepository.findAll();
	}
	public void deleteEmployee(int empid)
	{
		emprepository.deleteById(empid);
	}
	public Employee updateEmployee(int id,Employee empDet)
	{
//		Employee emp=emprepository.findById(id).get();
//		emp.setId(empDet.getId());
//		emp.setName(empDet.getName());o
//		emp.setLocation(empDet.getLocation());
		return emprepository.save(empDet);
		
	}

}
