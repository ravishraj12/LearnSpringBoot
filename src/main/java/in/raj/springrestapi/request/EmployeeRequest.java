package in.raj.springrestapi.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class EmployeeRequest {
	
	private String name;
	
	private List<String> department;
}
