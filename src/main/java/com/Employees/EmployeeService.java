package com.Employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class EmployeeService {
@Autowired
EmployeeDao ed;

public String postDetail(List<Employee>emps){
	return ed.postDetail(emps);
}

public Employee get(int id) {
	
	return ed.get(id);
}
public String delete(int id) {
	return ed.delete(id);
	
}

public String put(int id, Employee e) {

	return ed.put(id,e);
}
}
