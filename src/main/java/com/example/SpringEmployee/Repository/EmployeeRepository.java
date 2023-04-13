package com.example.SpringEmployee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringEmployee.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

}
