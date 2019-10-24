package sample.data.pcf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sample.data.pcf.entity.Employee;
import sample.data.pcf.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable("id") String empId){
		return employeeService.getEmployee(empId);
	}
	
	@PostMapping("/")
	public void addEmployee(@RequestBody Employee emp){
		employeeService.addEmployee(emp);
	}
	
	@PutMapping("/{id}")
	public void updateEmployee(@PathVariable("id") String id, @RequestBody Employee emp){
		employeeService.updateEmployee(id, emp);
	}
	
	@DeleteMapping("/{id}")
	public void updateEmployee(@PathVariable("id") String id){
		employeeService.deleteEmployee(id);
	}

}
