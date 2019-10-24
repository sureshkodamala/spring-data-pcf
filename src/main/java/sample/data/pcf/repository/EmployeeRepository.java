package sample.data.pcf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import sample.data.pcf.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {

}
