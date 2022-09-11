package pe.edu.upeu.clase01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.entity.Invoices;

@Component
public class InvoicesDaoIMpl implements Todo<Invoices> {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Invoices t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Invoices t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Invoices read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoices> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from invoices", new BeanPropertyRowMapper<Invoices>(Invoices.class));
	}

}
