package com.Employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/emps")
public class EmployeeController {
@Autowired
EmployeeService es;
@PostMapping(value="/details")
public String postDetail(@RequestBody List<Employee>emps){
	return es.postDetail(emps);
}
@GetMapping(value="/get/{id}")
public Employee get(@PathVariable int id) {
	return es.get(id);
	
}
@DeleteMapping(value="/delete/{id}")
public String delete(@PathVariable int id) {
return es.delete(id);
}
	@PutMapping(value="/put/{id}")
	public String put(@PathVariable int id,@RequestBody Employee e) {
		return es.put(id,e);
		
	}
}

