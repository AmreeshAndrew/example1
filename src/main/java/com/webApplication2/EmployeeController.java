package com.webApplication2;

import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/Employee")
public class EmployeeController {
	@Autowired
	EmployeeService es;

	@PostMapping(value = "/postEmployee")
	public String post(@RequestBody Employee e) {
		return es.post(e);

	}

	@PostMapping(value = "/postEmployeeAll")
	public String postAll(@RequestBody List<Employee> e1) {
		return es.postAll(e1);
	}

	@GetMapping(value = "/Emps")
	public List<Employee> getAll() {
		return es.getAll();
	}

	@GetMapping(value = "/get/{id}")
	public Employee get(@PathVariable int id) {
		return es.get(id);
	}

	@DeleteMapping(value = "/del/{id}")
	public String delete(@PathVariable int id) {
		return es.delete(id);
	}

	@PutMapping(value = "/Update/{id}")
	public String update(@PathVariable int id, @RequestBody Employee e) {
		return es.update(id, e);

	}

	@GetMapping(value = "/getAllEmps")
	public List<Employee> getAllEmpse() {
		return es.getAllEmps();
	}

	@GetMapping(value = "/getAllAge")
	public List<Employee> getAllAge() {
		return es.getAllAge();

	}

	@GetMapping(value = "/getAllDet")
	public List<Object> getAllDet() {
		return es.getAllDet();
	}

	@GetMapping(value = "/getAllNames/{name}")
	public List<String> getAllNames(@PathVariable String name) {
		return es.getAllNames(name);
	}

	@GetMapping(value = "/getNam/{a}")
	public List<String> getNam(@PathVariable String a) {
		return es.getNam(a);
	}

	@GetMapping(value = "/getSal")
	public int getSal() {
		return es.getSal();
	}

	@GetMapping(value = "/getCount")
	public List<Object> getCount() {
		return es.getCount();
	}

	@GetMapping(value = "/getOrder")
	public List<Employee> getOrder() {
		return es.getOrder();
	}

	@GetMapping(value = "/getTwo/{x}/{y}")
	public List<Employee> getTwo(@PathVariable String x, @PathVariable String y) {
		return es.getTwo(x, y);
	}

	@GetMapping(value = "/getA/{age}")
	public List<Employee> getA(@PathVariable int age) {
		return es.getA(age);
	}

	@GetMapping(value = "/getExp/{experience}")
	public List<String> getExp(@PathVariable int experience) {
		return es.getExp(experience);
	}
	
	@GetMapping(value="/getOut/{e1}/{e2}")
	public List<Employee>getOut(@PathVariable int e1,@PathVariable int e2) {
		return es.getOut(e1, e2);
	}
	
	}

	
