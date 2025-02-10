package com.webApplication2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;

	public String post(Employee e) {
		er.save(e);
		return "Saved Successfully";
	}

	public String postAll(List<Employee> e1) {
		er.saveAll(e1);
		return "List Saved";
	}

	public List<Employee> getAll() {
		return er.findAll();
	}
	
	public Employee get(int id) {
		return er.findById(id).get();
	}
	public String delete(int id) {
		er.deleteById(id);
		return "Deleted";
	}
	public String update(int id,Employee e) {
		Employee emp=er.findById(id).get();
		emp.setName(e.getName());
		emp.setAge(e.getAge());
		emp.setGender(e.getGender());
		emp.setExperience(e.getExperience());
		emp.setSalary(e.getSalary());
		er.save(emp);
		return "Updated Succesfully";
	}
	public List<Employee>getAllEmps(){
		return er.getAllEmps();
	}
	public List<Employee>getAllAge(){
		return er.getAllAge();
		
	}
	public List<Object>getAllDet(){
		return er.getAllDet();
}
	
	public List<String> getAllNames(String name){
		return er.getAllNames(name);
		
	}
	public List<String>getNam(String a){
		return er.getNam(a);
	}
 public int getSal() {
	 return er.getSal();
 }
 public List<Object>getCount(){
	 return er.getCount();
	 
 }
 public List<Employee>getOrder(){
	 return er.getOrder();
 }
 public List<Employee>getTwo(String x,String y){
	 return er.getTwo(x,y);
 }
 public List<Employee>getA(int age){
	 return er.getA(age);
 }
 public List<String> getExp(int experience){
	 return er.getExp(experience);
 }
	 public List<Employee>getOut(int e1,int e2){
		 return er.getOut(e1, e2);
	 
 }
	 
 
}
