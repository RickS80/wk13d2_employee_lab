package com.example.employees;

import com.example.employees.models.Department;
import com.example.employees.models.Employee;
import com.example.employees.models.Project;
import com.example.employees.repositories.DepartmentRepository;
import com.example.employees.repositories.EmployeeRepository;
import com.example.employees.repositories.ProjectRepository;
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

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeInDepartment(){
		Department it = new Department("IT");
		departmentRepository.save(it);
		Employee gerry = new Employee("Raul", 21, "ABC123", "raul@gmail.com", it);
		employeeRepository.save(gerry);
	}

	@Test
	public void addEmployeesAndProjects(){
		Department it = new Department("IT");
		departmentRepository.save(it);
		Employee raul = new Employee("Raul", 21, "ABC123", "raul@gmail.com", it);
		employeeRepository.save(raul);
		Project project1 = new Project("Codeclan", 50);
		projectRepository.save(project1);

		project1.addEmployee(raul);
		projectRepository.save(project1);
	}

}
