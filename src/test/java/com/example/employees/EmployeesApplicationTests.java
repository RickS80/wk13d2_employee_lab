package com.example.employees;

import com.example.employees.models.Employee;
import com.example.employees.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee gerry = new Employee("Gerry", 45, "ger3456", "gwaterston@yaboo.com");
		employeeRepository.save(gerry);
	}

}
