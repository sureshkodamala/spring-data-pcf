package sample.data.pcf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.data.pcf.entity.Employee;
import sample.data.pcf.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee() {
		System.out.println("Start getAllEmployee");
		List<Employee> empList = (List<Employee>)employeeRepository.findAll();
		System.out.println("Inside getAllEmployee");
		System.out.println(empList);
		return empList;
	}
	
	public Employee getEmployee(String id) {
		Optional<Employee> emp = employeeRepository.findById(id);
		if(emp.isPresent())
			return emp.get();
		return emp.orElseGet(Employee::new);
		//return employeeRepository.findById(id).orElseGet(Employee::new);
	}
	
	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);
	}
	
	public void updateEmployee(String id, Employee emp) {
		employeeRepository.save(emp);
	}
	
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}
}