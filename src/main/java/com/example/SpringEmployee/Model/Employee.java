package com.example.SpringEmployee.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	
	private String name;
	@Column
	  private String location;
	public Employee(){
	
	}
	public Employee(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	  

}
