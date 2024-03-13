package in.raj.springrestapi.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.raj.springrestapi.model.Employee;
import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
//	@Query(value = "select * from tbl_employee", nativeQuery = true)
//	List<Employee> getEmployees();
	
	List<Employee> getAllRecords();
	
//	List<Employee> findByDepartmentName(String name);
//	
//	@Query("FROM Employee WHERE department.name = :name")
//	List<Employee> getEmployeesByDeptName(String name);
	
//	List<Employee> findByName(String name);
//	
//	List<Employee> findByNameAndLocation(String name, String location);
//	
//	List<Employee> findByNameContaining(String keyword, Sort sort);
//	
//	@Query("From Employee WHERE name= :name OR location = :location")
//	List<Employee> getEmployeesByNameOrLocation(String name, String location);
//	
//	@Transactional
//	@Modifying
//	@Query("DELETE FROM Employee WHERE name = :name")
//	Integer deleteEmployeesByName(String name);
}
