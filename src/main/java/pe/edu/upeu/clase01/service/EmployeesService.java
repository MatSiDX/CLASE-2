package pe.edu.upeu.clase01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.daoImpl.EmployeesDaolMpl;
import pe.edu.upeu.clase01.entity.Employees;

@Service
public class EmployeesService implements Todo<Employees> {

	@Autowired
	private EmployeesDaolMpl daoIMpl;

	@Override
	public int create(Employees t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Employees t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employees read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employees> readAll() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll();
	}

}
