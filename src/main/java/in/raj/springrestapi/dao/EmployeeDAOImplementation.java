package in.raj.springrestapi.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import in.raj.springrestapi.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class EmployeeDAOImplementation {
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<Employee> getAll(){
		return manager.createNamedQuery("getAllRecords", Employee.class).getResultList();
	}
}
