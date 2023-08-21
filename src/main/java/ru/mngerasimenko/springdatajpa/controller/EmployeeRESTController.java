package ru.mngerasimenko.springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mngerasimenko.springdatajpa.entity.Employee;
import ru.mngerasimenko.springdatajpa.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRESTController {

	private final EmployeeService service;

	@Autowired
	public EmployeeRESTController(EmployeeService service) {
		this.service = service;
	}

	@GetMapping("/employees")
	public List<Employee> showAll() {
		return service.getAll();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		Employee employee = service.getById(id);

		return employee;
	}

	@PostMapping("/employees")
	public Employee addNewEmployee(@RequestBody Employee employee) {
		service.save(employee);

		return employee;
	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		service.save(employee);

		return employee;
	}

	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		service.delete(id);

		return "Employee with ID = " + id + " was deleted";
	}

	@GetMapping("/employees/name/{name}")
	public List<Employee> getAllByName(@PathVariable String name) {
		return service.findAllByName(name);
	}
}
