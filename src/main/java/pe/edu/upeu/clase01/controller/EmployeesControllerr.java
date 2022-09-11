package pe.edu.upeu.clase01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.clase01.entity.Employees;
import pe.edu.upeu.clase01.service.EmployeesService;

@RestController
public class EmployeesControllerr {
	
	@Autowired
	private EmployeesService employeesService;
	
	@GetMapping("/employees")
	public List<Employees> getList(){
		return employeesService.readAll();
		
	}
	

}
