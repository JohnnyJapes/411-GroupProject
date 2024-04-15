package psu.edu.jupitercompany.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import psu.edu.jupitercompany.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


}