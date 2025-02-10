package com.Employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PutMapping;

@Repository
public class EmployeeDao {
@Autowired
EmployeeRepository er;
public String postDetail(List<Employee>emps){
	er.saveAll(emps);
	return "Saved";
}
public Employee get(int id) {
	return er.findById(id).get();
}
public String delete(int id) {
	er.deleteById(id);
	return "deleted";
}
public String put(int id, Employee e) {
	Employee emps=er.findById(id).get();
	emps.setName(e.getName());
	emps.setSalary(e.getSalary());
	emps.setDept(e.getDept());
	emps.setExperience(e.getExperience());
	er.save(emps);
	return "updated";
}
}