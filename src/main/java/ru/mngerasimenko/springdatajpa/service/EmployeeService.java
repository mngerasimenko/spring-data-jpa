package ru.mngerasimenko.springdatajpa.service;


import ru.mngerasimenko.springdatajpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

	List<Employee> getAll();

	List<Employee> findAllByName(String name);

	void save(Employee employee);

	Employee getById(int id);

	void delete(int id);
}
