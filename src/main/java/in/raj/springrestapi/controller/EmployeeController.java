package in.raj.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.raj.springrestapi.dao.EmployeeDAOImplementation;
import in.raj.springrestapi.model.Employee;
import in.raj.springrestapi.repository.EmployeeRepository;

@RestController 
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository eRepo;
	
	@Autowired
	private EmployeeDAOImplementation eDAO;
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return eRepo.save(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return eRepo.getAllRecords();
	}
}
