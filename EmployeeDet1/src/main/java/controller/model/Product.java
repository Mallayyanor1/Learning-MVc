package controller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String job_role;
private double salary;
private  String join_Date;

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", job_role=" + job_role + ", salary=" + salary + ", join_Date="
			+ join_Date + "]";
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
public String getJob_role() {
	return job_role;
}
public void setJob_role(String job_role) {
	this.job_role = job_role;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getJoin_Date() {
	return join_Date;
}
public void setJoin_Date(String join_Date) {
	this.join_Date = join_Date;
}
public Product(int id, String name, String job_role, double salary, String join_Date) {
	super();
	this.id = id;
	this.name = name;
	this.job_role = job_role;
	this.salary = salary;
	this.join_Date = join_Date;
}
public Product() {
	
}

 
}
