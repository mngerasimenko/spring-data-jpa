package ru.mngerasimenko.springdatajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mngerasimenko.springdatajpa.dao.EmployeeRepository;
import ru.mngerasimenko.springdatajpa.entity.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeDAO) {
		this.employeeRepository = employeeDAO;
	}

	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findAllByName(String name) {
		return employeeRepository.findAllByName(name);
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Employee getById(int id) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
		return optionalEmployee.orElse(null);
	}

	@Override
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
}
