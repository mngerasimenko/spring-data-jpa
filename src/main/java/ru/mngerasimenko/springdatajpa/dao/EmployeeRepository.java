package ru.mngerasimenko.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mngerasimenko.springdatajpa.entity.Employee;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findAllByName(String name);

}
