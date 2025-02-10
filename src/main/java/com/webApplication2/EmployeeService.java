package com.webApplication2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;

	public String post(@RequestBody Employee e) {
		return ed.post(e);
	}

	public String postAll(List<Employee> e1) {
		return ed.postAll(e1);
	}

	public List<Employee> getAll() {
		return ed.getAll();
	}

	public Employee get(int id) {
		return ed.get(id);
	}

	public String delete(int id) {
		return ed.delete(id);
	}

	public String update(int id, Employee e) {
		return ed.update(id, e);
	}

	public List<Employee> getAllEmps() {
		return ed.getAllEmps();
	}

	public List<Employee> getAllAge() {
		return ed.getAllAge();
	}

	public List<Object> getAllDet() {
		return ed.getAllDet();

	}

	public List<String> getAllNames(String name) {
		return ed.getAllNames(name);

	}

	public List<String> getNam(String a) {
		return ed.getNam(a);

	}

	public int getSal() {
		return ed.getSal();
	}

	public List<Object> getCount() {
		return ed.getCount();
	}

	public List<Employee> getOrder() {
		return ed.getOrder();
	}

	public List<Employee> getTwo(String x, String y) {
		return ed.getTwo(x, y);
	}

	public List<Employee> getA(int age) {
		return ed.getA(age);
	}

	public List<String> getExp(int experience) {
		return ed.getExp(experience);
	}
public List<Employee>getOut(int e1,int e2){
	return ed.getOut(e1, e2);
}
}

