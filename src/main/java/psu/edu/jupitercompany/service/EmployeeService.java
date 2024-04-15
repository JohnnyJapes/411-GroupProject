package psu.edu.jupitercompany.service;

import java.util.List;

import psu.edu.jupitercompany.entity.Employee;

public interface EmployeeService {
	
	
	List<Employee> findAll();
	
	Employee findById(int ID);
	
	Employee save(Employee theEmployee);
	
	void deleteById(int ID);
	


}
