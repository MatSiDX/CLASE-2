package pe.edu.upeu.clase02.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase02.dao.Todo;
import pe.edu.upeu.clase02.daoImpl.ProductoDaolMpl;
import pe.edu.upeu.clase02.entity.Producto;

@Service
public class ProductoService implements Todo<Producto> {

	@Autowired
	private ProductoDaolMpl daoIMpl;

	@Override
	public int create(Producto t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
	}

	@Override
	public int update(Producto t) {
		// TODO Auto-generated method stub
		return daoIMpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoIMpl.delete(id);
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return daoIMpl.read(id);
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll2();
	}

	

}
