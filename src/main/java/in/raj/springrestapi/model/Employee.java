package in.raj.springrestapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name="tbl_employee")
@NoArgsConstructor
//@NamedNativeQuery(name = "getAllRecords", query = "select * from tbl_employee", resultClass = Employee.class)
@NamedQuery(name = "Employee.getAllRecords", query = "FROM Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@NotBlank(message = "Name should not be null")
	private String name;
	
//	@OneToOne
//	@JoinColumn(name="department_id")
//	private Department department;
	
//	@OneToMany(mappedBy="employee")
//	private List<Department> departments;
	
//	public Employee(EmployeeRequest req) {
//		this.name = req.getName();
//	}
	
//	private Long age = 0L;
//	
	private String location;
//	
//	@Email(message = "Please provide the valid email")
//	private String email;
//	
//	@NotBlank(message = "Department should not be null")
//	private String department;
//	
//	@CreationTimestamp
//	@Column(name = "created_at", nullable = false, updatable = false)
//	private Date createAt;
//	
//	@UpdateTimestamp
//	@Column(name = "updated_at")
//	private Date updateAt;
}
