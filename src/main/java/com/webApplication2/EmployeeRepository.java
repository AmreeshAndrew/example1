package com.webApplication2;

import java.util.List;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query(value = "select*from emplpoyee_table", nativeQuery = true)
	public List<Employee> getAllEmps();

	@Query(value = "select*from emplpoyee_table where age>25 and gender='male'", nativeQuery = true)
	public List<Employee> getAllAge();

	@Query(value = "Select name,gender from emplpoyee_table where salary >50000", nativeQuery = true)
	public List<Object> getAllDet();

	@Query(value = "select name from emplpoyee_table where name like ?1%", nativeQuery = true)
	public List<String> getAllNames(String name);

	@Query(value = "select name from emplpoyee_table where name not like ?1%", nativeQuery = true)
	public List<String> getNam(String name);

	@Query(value = "select sum(salary) from emplpoyee_table", nativeQuery = true)
	public int getSal();

	@Query(value = "select experience,count(experience) from emplpoyee_table group by(experience)", nativeQuery = true)
	public List<Object> getCount();

	@Query(value = "Select*from emplpoyee_table order by salary desc", nativeQuery = true)
	public List<Employee> getOrder();

	@Query(value = "select*from emplpoyee_table where experience>2 and experience<4", nativeQuery = true)
	public List<Employee> getExp();

	@Query(value = "select * from emplpoyee_table where name like ?1% or ?1%", nativeQuery = true)
	public List<Employee> getTwo(String x, String y);

//JPA Query 

	@Query(value = "select a from Employee a where a.age>=:x")
	public List<Employee> getA(@Param("x") int age);

	@Query(value = "select a.name from Employee a where a.experience >=:y")
	public List<String> getExp(@Param("y") int experience);

	@Query(value = "select a from Employee a where a.experience between :x and :y")
	public List<Employee> getOut(@Param("x") int e1, @Param("y") int e2);
	
	
}

