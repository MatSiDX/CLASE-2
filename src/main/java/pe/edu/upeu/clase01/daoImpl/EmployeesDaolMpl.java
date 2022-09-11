package pe.edu.upeu.clase01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.entity.Employees;

@Component
public class EmployeesDaolMpl implements Todo<Employees> {
	@Autowired
	private JdbcTemplate jdbcTemplate;

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
		return jdbcTemplate.query("select *from employees", new BeanPropertyRowMapper<Employees>(Employees.class));
	}

}
