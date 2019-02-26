package com.example.employees.repositories;

import com.example.employees.models.Employee;
import com.example.employees.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}